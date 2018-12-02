package zoo;

import zoo.Mammiferes;
import zoo.Poisson;
import zoo.Reptile;
import zoo.Oiseaux;
import zoo.Zoo;

public class TestZoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo(); // création zoo, avec même signature que le constructeur tableau dans classe Zoo

		/**
		 * on applique la méthode addAnimalToZone à l'objet zoo, en créant l'animal à
		 * ajouter (new ClasseFilleAnimal) directement dans les paramètres (avec
		 * toString associé à la classe fille) => polymorphisme
		 */

		zoo.addAnimalToZone(new Mammiferes("Simba", "Lion", "carnivore"));
		zoo.addAnimalToZone(new Mammiferes("Lana", "Lionne", "carnivore"));
		zoo.addAnimalToZone(new Mammiferes("Gazella", "Gazelle", "herbivore"));
		zoo.addAnimalToZone(new Mammiferes("Anti", "Antiloppe", "herbivore"));
		zoo.addAnimalToZone(new Mammiferes("Zou", "Zèbre", "herbivore"));
		zoo.addAnimalToZone(new Poisson("BouffeTout", "Requin", "carnivore"));
		zoo.addAnimalToZone(new Poisson("Mélanie", "Morue", "omnivore"));
		zoo.addAnimalToZone(new Reptile("Ecaille", "Anaconda", "carnivore"));
		zoo.addAnimalToZone(new Reptile("Kâ", "Boa", "carnivore"));
		zoo.addAnimalToZone(new Oiseaux("Rio", "Perroquet", "herbivore"));
		zoo.addAnimalToZone(new Oiseaux("Kaiser", "Aigle", "carnivore"));
		System.out.println(zoo.toString());

	}

}
