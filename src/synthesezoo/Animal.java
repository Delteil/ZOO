package synthesezoo;

public class Animal {

	// attributs

	protected String race = null;
	protected String surnom = null;
	protected String sexe = null;
	protected int numTatouage = 0;

	// constructeur

	public Animal(String race, String surnom, String sexe, int numTatouage) {
		super();
		this.race = race;
		this.surnom = surnom;
		this.sexe = sexe;
		this.numTatouage = numTatouage;
	}

	// toString

	@Override
	public String toString() {
		return "race= " + race + ", surnom= " + surnom + ", sexe= " + sexe + ", numTatouage= " + numTatouage;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getNumTatouage() {
		return numTatouage;
	}

	public void setNumTatouage(int numTatouage) {
		this.numTatouage = numTatouage;
	}

}
