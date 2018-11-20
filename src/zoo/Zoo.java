package zoo;

public class Zoo {

	// Attributs de la classe Zoo
	
	private Zone[] zones;

	public static final int INDICE_ZONE_SAVANE_AFRICAINE = 0;
	public static final int INDICE_ZONE_AQUARIUM = 1;
	public static final int INDICE_ZONE_FERME_REPTILES = 2;
	public static final int INDICE_ZONE_CARNIVORES = 3;
	public static final int INDICE_ZONE_VOLIERE = 4;

	// constructeur Tableau
	
	public Zoo() {
		zones = new Zone[5];
		zones[INDICE_ZONE_SAVANE_AFRICAINE] = new Zone("Savane africaine");
		zones[INDICE_ZONE_AQUARIUM] = new Zone("Aquarium");
		zones[INDICE_ZONE_FERME_REPTILES] = new Zone("Ferme de reptile");
		zones[INDICE_ZONE_CARNIVORES] = new Zone("Carnivore");
		zones[INDICE_ZONE_VOLIERE] = new Zone("Voliere");
	}

	// méthode AddAnimalToZone

	public void addAnimalToZone (Animal animal) { // méthode addAnimalToZone de type Animal)
		
		if (animal instanceof Mammifères) && (regimeAlimentaire equals "carnivore") {
			zones[INDICE_ZONE_CARNIVORES] = animal
		}
		if (animal instanceof Mammifères) && (regimeAlimentaire equals to herbivore) {
			zones[INDICE_ZONE_SAVANE_AFRICAINE] = animal	
		}
		if (animal instanceof Reptile) {
			zones[INDICE_ZONE_FERME_REPTILES] = animal
		}
		if (animal instanceof Oiseaux) {
			zones[INDICE_ZONE_VOLIERE] = animal
		}
		if (animal instanceof Poisson) {
			zones[INDICE_ZONE_AQUARIUM] = animal
		}
		
	}

	// constructeur addAnimalToZone

	// toString ZOO

	protected Zone[] getZone() {
		return zones;
	}

	protected void setZone(Zone[] zones) {
		this.zones = zones;
	}

}
