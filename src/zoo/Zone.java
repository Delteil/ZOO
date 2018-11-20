package zoo;

import java.util.Arrays;

public class Zone {

	// Attributs de la classe Zones
	
	private String nom = null;
	private Animal[] animaux = null; // tableau de la liste d'animaux ds classe Animaux

	public Zone(String nom, Animal[] animaux) {
		super();
		this.nom = nom;
		this.animaux = animaux;
	}

	@Override
	public String toString() {
		return "Zone [nom=" + nom + ", animaux=" + Arrays.toString(animaux) + "]";
	}

	// Ajout nouvel Animal

	public void addAnimal(Animal animalAAjouter) { // méthode addAnimal de type Animal - ajout du paramètre entre () après la méthode.
		
		if (animaux == null) { // vérifier la condition que le tableau est vide.
			Animal[] animaux = new Animal[1]; // si oui, nouveau tbleau prend une ligne
			animaux[0] = animalAAjouter; // liggen indice 0 prend nouveau parametre
			
		} else { 			// si animaux!= null
			Animal[]animalTemp = new Animal[animaux.length + 1]; // création d'un tableau temporaire +1 

			for (int i = 0; i < animaux.length; i++) {
				animalTemp[i] = animaux[i];			// tableau Temp prend les valeurs de Tableau
			}
			animalTemp[animalTemp.length - 1] = animalAAjouter;

			animaux = animalTemp; // tableau animaux prend les valeurs du tableau animalTemp
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Animal[] getAnimal() {
		return animaux;
	}

	public void setAnimal(Animal[] animaux) {
		this.animaux = animaux;

	}

}
