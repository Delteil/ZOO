package zoo;

public class Zones {

	// Attributs de la classe Zones
	private String nomZone = null;
	private Animal[] animals; // tableau de la liste d'animaux ds classe Animaux

	public String getNomZone() {
		return nomZone;
	}

	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}

	public Animal[] getAnimal() {
		return animals;
	}

	public void setAnimal(Animal[] animals) {
		this.animals = animals;
	}

	public Zones(String nomZone, Animal[] animals) { // affiche la zone avec les animaux associés à cette zone
		this.nomZone = nomZone;
		this.animals = animals;
	}

}
