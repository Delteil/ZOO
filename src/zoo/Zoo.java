package zoo;

import java.util.Arrays;

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

	// méthode AddAnimalToZone : ajout d'un animal (paramètre animalAAjouter) dans
	// le tableau Zone en vérifiant les conditions d'appartenance à la zone.

	public void addAnimalToZone(Animal animalAAjouter) { // méthode addAnimalToZone de type Animal et paramètre
															// animalAAjouter)

		if (animalAAjouter instanceof Mammiferes && animalAAjouter.getRegimeAlimentaire().equals("carnivore")) {
			zones[INDICE_ZONE_CARNIVORES].addAnimal(animalAAjouter);
		} else if (animalAAjouter instanceof Mammiferes && animalAAjouter.getRegimeAlimentaire().equals("herbivore")) {
			zones[INDICE_ZONE_SAVANE_AFRICAINE].addAnimal(animalAAjouter);
		} else if (animalAAjouter instanceof Reptile) {
			zones[INDICE_ZONE_FERME_REPTILES].addAnimal(animalAAjouter);
		} else if (animalAAjouter instanceof Oiseaux) {
			zones[INDICE_ZONE_VOLIERE].addAnimal(animalAAjouter);
		} else if (animalAAjouter instanceof Poisson) {
			zones[INDICE_ZONE_AQUARIUM].addAnimal(animalAAjouter);
		}
	}

	// toString ZOO

	@Override
	public String toString() {
		return "Zoo \r\n" + Arrays.toString(zones) + "\r\n";
	}

	protected Zone[] getZone() {
		return zones;
	}

	protected void setZone(Zone[] zones) {
		this.zones = zones;
	}

}
