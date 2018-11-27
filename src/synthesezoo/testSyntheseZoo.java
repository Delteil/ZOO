/*
 * Un zoo doit gérer les accouplements entre animaux.
Un animal possède une race, un surnom, un sexe et un numéro de tatouage.
Deux animaux peuvent être accouplés si et seulement s’ils sont de sexe opposé et de même race (c’est
l’animal male qui garde l’information d’accouplement).
On peut visualiser les informations d'un animal et pour chaque male les informations de l’animal
accouplé.
Par exemple, pour un lion, on pourra aussi visualiser les informations de la lionne qui s’est accouplée
avec lui.
Ecrire une implémentation de ce problème en langage java. Dans une classe main créer deux animaux
de même race, de sexe opposé et accouplés ensembles. Afficher leur informations grâce à la méthode
toString().
Dans cet exercice, commentez le code et utilisez les annotations « javadoc ».
 */

package synthesezoo;

import synthesezoo.Animal;

public class testSyntheseZoo {

	public static void main(String[] args) {

		Animal a1 = new Animal("Lion", "Simba", "male", 01);
		Animal a2 = new Animal("Lion", "Lana", "femelle", 02);

		// si Animal 1 de même race et de sexe different
		if (a1.getRace() == a2.getRace() && a1.getSexe() != a2.getSexe()) {

			// alors animal1 affiche animal1 + animal2)

			System.out.println(a1 + "  " + a2);
		} else {
			
			System.out.println(a1);
		}

	}

}
