package zoo;

public abstract class Animal {

	// Attributs de la classe Animal
	
	protected String nom = null;
	protected String type = null;
	protected String regimeAlimentaire = null;

	//definition de constantes
	
	public static final String REGIME_CARNIVORE = "carnivore"; 
	public static final String REGIME_HERBIVORE = "herbivore";
	public static final String REGIME_OMNIVORE = "omnivore";

	
	// Constructeur

	protected Animal(String nom, String type, String regimeAlimentaire) {
		super();
		this.nom = nom;
		this.type = type;
		this.regimeAlimentaire = regimeAlimentaire;
		
		
	}

	protected String getNom() {
		return nom;
	}

	protected void setNom(String nom) {
		this.nom = nom;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected String getRegimeAlimentaire() {
		return regimeAlimentaire;
	}

	protected void setRegimeAlimentaire(String regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}

	protected static String getRegimeCarnivore() {
		return REGIME_CARNIVORE;
	}

	protected static String getRegimeHerbivore() {
		return REGIME_HERBIVORE;
	}

	protected static String getRegimeOmnivore() {
		return REGIME_OMNIVORE;
	}

}
