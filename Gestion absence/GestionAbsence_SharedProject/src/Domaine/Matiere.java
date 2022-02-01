package Domaine;

public class Matiere {
	
	private int CodeMat;
	

	private String LibelleMat;
	private int vhs;
	private int coef;

	public Matiere() {
		
	}
	public Matiere(int codeMat, String libelleMat, int vhs, int coef) {
		super();
		CodeMat = codeMat;
		LibelleMat = libelleMat;
		this.vhs = vhs;
		this.coef = coef;
	}
	
	public int getCodeMat() {
		return CodeMat;
	}

	public void setCodeMat(int codeMat) {
		CodeMat = codeMat;
	}

	public String getLibelleMat() {
		return LibelleMat;
	}

	public void setLibelleMat(String libelleMat) {
		LibelleMat = libelleMat;
	}

	public int getVhs() {
		return vhs;
	}

	public void setVhs(int vhs) {
		this.vhs = vhs;
	}

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

}
