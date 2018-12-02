package zoo;

public class Mammiferes extends Animal {

	public Mammiferes(String nom, String type, String regimeAlimentaire) {
		super(nom, type, regimeAlimentaire);
	}

	public Mammiferes(String nom, RaceEnum race, SexeEnum sexe, String numTatouage) {
		super(nom, race, sexe, numTatouage);
	}

	@Override
	public String toString() {
		return "nom = " + nom + ", race = " + race + ", sexe = " + sexe + ", numTatouage = " + numTatouage
				+ ", animalAccouple = " + animalAccouple;

	}

}
