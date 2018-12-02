package zoo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import zoo.Animal;

class ZooTest {

	Animal mNew1 = new Mammiferes("Doe", RaceEnum.LION, SexeEnum.MALE, "01");
	Animal mNew2 = new Mammiferes("Jane", RaceEnum.LION, SexeEnum.FEMELLE, "02");

	// Test Accouplement

	@Test
	public void accouplement_races_differentes_impossible() {
		mNew2.setRace(RaceEnum.LION);
		assertTrue(mNew1.setAnimalAccouple(mNew2), "Pas de meme race");
	}

	@Test
	public void accouplement_de_meme_sexe_impossible() {
		mNew2.setSexe(SexeEnum.FEMELLE);

		assertTrue(mNew1.setAnimalAccouple(mNew2), "accouplement impossible, animaux de meme sexe");
	}
	
	@Test
	public void information_accouplement_portée_par_le_male() {
		mNew1.setSexe(SexeEnum.MALE);
		
		assertTrue(mNew1.setAnimalAccouple(mNew2), "impossible, l'information est stockée chez le male de la race");
	}
}