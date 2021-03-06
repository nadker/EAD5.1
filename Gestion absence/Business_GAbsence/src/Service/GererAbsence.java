package Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Domaine.AvoirAbsence;
import Domaine.Etudiant;
import Domaine.Matiere;
import IDAO.IDAO_AvoirAbsence;

public class GererAbsence {

	IDAO_AvoirAbsence _DBabsence;
	
public GererAbsence(IDAO_AvoirAbsence dbabsence) {
		super();
		this._DBabsence = dbabsence;
	}

public List <AvoirAbsence> AfficherAbsence (Etudiant E,Matiere Matiere, int Annee,int semestre) throws SQLException
{
	
	List<AvoirAbsence> absences=_DBabsence.RecupererAvAbsence();
	List<AvoirAbsence> absencesselect=new ArrayList<AvoirAbsence>();
	for (AvoirAbsence ab : absences)
	{
		
		if (ab.getEtudiant().getCode_ID()==E.getCode_ID()
			&& ab.getMatiere().getCodeMat()==Matiere.getCodeMat()
			&& ab.getAnneeUniv()==Annee
			&& ab.getSemestre()==semestre)
		{
			absencesselect.add(ab);
		}
	}
	return absencesselect;
}

@SuppressWarnings("rawtypes")
public int RecupHeureAbsence (Etudiant e,Matiere m,int annee,int semestre) throws SQLException
{
	

return ((ArrayList)AfficherAbsence(e,m,annee,semestre)).size();
}

public boolean EtudiantElim(Etudiant e,Matiere m,int annee,int semestre) throws SQLException 
{
	float tauxheures=m.getVhs()/5;
	//float tauxseances= tauxheures-(tauxheures/2);
	int nbAbsence = AfficherAbsence (e,m,annee,semestre).size();
	if (nbAbsence>tauxheures)
		return true;
		return false;
	


}

	
}
