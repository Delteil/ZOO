package zoo;

public class Animal {
	
	//Attributs de la classe Animal
	private String nom = null;
	private String type = null;

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

	//Constructeur
	public Animal(String nom, String type) {
		this.nom = nom;
		this.type = type;
	}

}
