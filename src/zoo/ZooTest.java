package zoo;

import static org.junit.Assert.*;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import zoo.Animal;

class ZooTest {

	ArrayList<Mammiferes> liste = new ArrayList<Mammiferes>();

	Mammiferes m1 = new Mammiferes("Simba", RaceEnum.LION, SexeEnum.MALE, "01");
	Mammiferes m2 = new Mammiferes("Lana", RaceEnum.LION, SexeEnum.FEMELLE, "02");
	Mammiferes m3 = new Mammiferes("Zou", RaceEnum.ZEBRE, SexeEnum.MALE, "210");
	Mammiferes m4 = new Mammiferes("Nanou", RaceEnum.ZEBRE, SexeEnum.FEMELLE, "215");
	Mammiferes m5 = new Mammiferes("Tigrou", RaceEnum.TIGRE, SexeEnum.MALE, "650");
	Mammiferes m6 = new Mammiferes("Sharkan", RaceEnum.TIGRE, SexeEnum.MALE, "620");



	// Test setAnimalAccouple(Animal animalAccouple)

	@Test
	public void test_accouplement() {
		Mammiferes mNew = new Mammiferes("Jane", RaceEnum.LION, SexeEnum.FEMELLE, "0");
		Mammiferes mNew2 = new Mammiferes("Doe", RaceEnum.LION, SexeEnum.MALE, "1");
		assertTrue(this.animalAccouple = animalAccouple);
			
	}
	
}
