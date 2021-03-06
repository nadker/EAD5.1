package DAOImplement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAOConnection.DBConnection;
import Domaine.AvoirAbsence;
import Domaine.Etudiant;
import Domaine.Matiere;
import IDAO.IDAO_AvoirAbsence;

public class Imp_AvoirAbsence implements IDAO_AvoirAbsence {

	static Connection con= DBConnection .getConnection();
	
	@Override
	public boolean AjoutAvAbsence(AvoirAbsence arg0) throws SQLException 	{
				
		try {
		String requette = "INSERT INTO avoirabsence"
	    		+ "(idabs, dateabs, semestre, annuniv,codee,codemat ) VALUES"
	    		+ "(?,?,?,?,?,?)";
		PreparedStatement param = con.prepareStatement(requette);
		param.setInt(1, arg0.getIdAbsence());
		param.setDate(2, (java.sql.Date) arg0.getDate_abs());
		param.setInt(3, arg0.getSemestre());
		param.setInt(4, arg0.getAnnUniv());
		param.setInt(5, arg0.getEtudiant().getCode_ID());
		param.setInt(6, arg0.getMatiere().getCodeMat());
		    int  nb = param.executeUpdate();
		    return (nb>0);
		}
			catch (SQLException e)
			{
				System.out.println (e.getMessage()); return false;
			}
	
	}
	
	
	@Override
	public boolean ModifierAvAbsence(AvoirAbsence arg0)throws SQLException  {
		try {
			
			String requette= "update avoirabscence "
		    		+ "set dateabs = ?"
		    		+ ", semestre = ?"
		    		+ ", annuniv =?"
		    		+ ", codee =?"
		    		+ ", codemat =?"
		    		+ " WHERE idabs =?";
			PreparedStatement param = con.prepareStatement(requette);
			param.setInt(1, arg0.getIdAbsence());
			param.setDate(2, (java.sql.Date) arg0.getDate_abs());
			param.setInt(3, arg0.getSemestre());
			param.setInt(4, arg0.getAnnUniv());
			param.setInt(5, arg0.getEtudiant().getCode_ID());
			param.setInt(6, arg0.getMatiere().getCodeMat());
		    int  nb = param.executeUpdate();
		    return (nb>0);
		}
		catch (SQLException e)
		
		{
			System.out.println (e.getMessage());
			return false;
			
		}
	}
	
	@Override
	public List<AvoirAbsence> RecupererAvAbsence() throws SQLException  {
		 ArrayList <AvoirAbsence> liste=null;
		AvoirAbsence AvAb;
		Etudiant Et;
		Matiere mat;
		try {
		String requette = "select * from avoirabscence";
        PreparedStatement param
            = con.prepareStatement(requette);
        ResultSet res = param.executeQuery();
        liste = new ArrayList <AvoirAbsence>();
  
        while (res.next())
        {
            AvAb = new AvoirAbsence();
            Et= new Etudiant();
            mat=new Matiere();
         AvAb.setSemestre(res.getInt(3));
         AvAb.setDate_abs(res.getDate(2));
		 AvAb.setAnnUniv(res.getInt(4));
		 AvAb.setEtudiant(Et);
		 AvAb.setMatiere(mat);
		 liste.add(AvAb);
		}
		}
		catch (SQLException e) 
		{
			System.out.println (e.getMessage());
		}
		
		return liste;
		
	}
	
	@Override
	public boolean SupprimerAvAbsence(AvoirAbsence arg0) throws SQLException  {
		
		try
		{
		String requette = "delete from avoirabsence where idaps =?";
		PreparedStatement param= con.prepareStatement(requette);
		param.setInt(1, arg0.getIdAbsence());
		int nb=param.executeUpdate();
	    return (nb>0);
		}
		catch (SQLException e)
		{
			System.out.println (e.getMessage()); 
			return false;
		}
	
	}

}
