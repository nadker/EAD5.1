package Domaine;

import java.util.Date;

public class AvoirAbsence {
	
	

	private Etudiant etudiant;
	private Matiere matiere;
	private int idAbsence;
	private Date date_abs;
	private int semestre;
	private int AnnUniv;
	
	public AvoirAbsence() {
	}
	public AvoirAbsence(Etudiant etudiant, Matiere matiere, int idAbsence, Date date_abs, int semestre,int annUniv) {
		super();
		this.etudiant = etudiant;
		this.matiere = matiere;
		this.idAbsence = idAbsence;
		this.date_abs = date_abs;
		this.semestre = semestre;
		AnnUniv = annUniv;
	}
	
	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public int getAnnUniv() {
		return AnnUniv;
	}

	public void setAnnUniv(int annUniv) {
		AnnUniv = annUniv;
	}

	public int getIdAbsence() {
		return idAbsence;
	}

	public void setIdAbsence(int idAbsence) {
		this.idAbsence = idAbsence;
	}

	public Date getDate_abs() {
		return date_abs;
	}

	public void setDate_abs(Date date_abs) {
		this.date_abs = date_abs;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getAnneeUniv() {
		return AnnUniv;
	}

	public void setAnneeUniv(int annUniv) {
		AnnUniv = annUniv;
	}
	


}
