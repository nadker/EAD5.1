package IDAO;

import java.util.List;

import Domaine.Matiere;

public interface IDAO_Matiere {

	boolean AjoutMatiere(Matiere Matiere);
	boolean ModifierMatiere(Matiere Matiere);
	boolean SupprimerMatiere(Matiere Matiere);
	
	List <Matiere> RecupererMatiere();
	
}
