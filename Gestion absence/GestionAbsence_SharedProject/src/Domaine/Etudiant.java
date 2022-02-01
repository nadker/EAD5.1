package Domaine;

public class Etudiant {
private int Code_ID;
private String nom;
private String prenom;
private String adresse;

public Etudiant() {
	
}
public Etudiant(int code_ID, String nom, String prenom, String adresse) {
	super();
	Code_ID = code_ID;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
}


public int getCode_ID() {
	return Code_ID;
}
public void setCode_ID(int code_ID) {
	Code_ID = code_ID;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}





}
