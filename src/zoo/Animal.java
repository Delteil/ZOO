package zoo;

/**
 * 
 * @author Amandine Delteil
 *
 */

public abstract class Animal {

	/**
	 * Attributs de la classe Animal
	 */

	protected String nom = null;
	protected String type = null;
	protected String regimeAlimentaire = null;
	protected RaceEnum race = null;
	protected SexeEnum sexe = null;
	protected String numTatouage = null;
	protected Animal animalAccouple = null;

	/**
	 * definition des constantes
	 */

	public static final String REGIME_CARNIVORE = "carnivore";
	public static final String REGIME_HERBIVORE = "herbivore";
	public static final String REGIME_OMNIVORE = "omnivore";

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param type
	 * @param regimeAlimentaire
	 */

	public Animal(String nom, String type, String regimeAlimentaire) {
		super();
		this.nom = nom;
		this.type = type;
		this.regimeAlimentaire = regimeAlimentaire;
	}

	/**
	 * @param nom
	 * @param race
	 * @param sexe
	 * @param numTatouage
	 */

	public Animal(String nom, RaceEnum race, SexeEnum sexe, String numTatouage) {
		super();
		this.nom = nom;
		this.race = race;
		this.sexe = sexe;
		this.numTatouage = numTatouage;
		this.animalAccouple = animalAccouple;
	}

	/**
	 * affichage de l'animal - methode toString
	 */

	@Override
	public String toString() {
		return "nom = " + nom + ", type = " + type + ", regimeAlimentaire = " + regimeAlimentaire + "\r\n";
	}

	/**
	 * 
	 * getter/setter
	 */

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegimeAlimentaire() {
		return regimeAlimentaire;
	}

	public void setRegimeAlimentaire(String regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}

	public RaceEnum getRace() {
		return race;
	}

	public void setRace(RaceEnum race) {
		this.race = race;
	}

	public SexeEnum getSexe() {
		return sexe;
	}

	public void setSexe(SexeEnum sexe) {
		this.sexe = sexe;
	}

	public String getNumTatouage() {
		return numTatouage;
	}

	public void setNumTatouage(String numTatouage) {
		this.numTatouage = numTatouage;
	}

	public Animal getAnimalAccouple() {
		return animalAccouple;
	}

	/**
	 * 
	 * @param animalAccouple : données enregistrées seulement si l'animal est une
	 *                       femelle de même race
	 */
	public void setAnimalAccouple(Animal animalAccouple) {

		if (this.sexe == SexeEnum.MALE && animalAccouple.getSexe() == SexeEnum.FEMELLE
				&& animalAccouple.getRace() == this.race) {

			this.animalAccouple = animalAccouple;

		} else {
			System.out.println("Cet animal " + getNom() + " " + getRace() + " ne peut pas être enregistre pour l'accouplement avec " + getRace() + " " + getSexe());
			}
	}

	public static String getRegimeCarnivore() {
		return REGIME_CARNIVORE;
	}

	public static String getRegimeHerbivore() {
		return REGIME_HERBIVORE;
	}

	public static String getRegimeOmnivore() {
		return REGIME_OMNIVORE;
	}

}
