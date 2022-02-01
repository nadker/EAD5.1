package IDAO;

import java.util.List;

import Domaine.Etudiant;


public interface IDAO_Etudiant {

	boolean AjoutEtudiant(Etudiant Etudiant);
	boolean ModifierEtudiant(Etudiant Etudiant);
	boolean SupprimerEtudiant(Etudiant Etudiant);
	List <Etudiant> RecupererEtudiants();
}
