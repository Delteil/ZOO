package zoo;

/**
 * 
 * @author Delteil
 *
 */

public class TestAccouplementZoo {

	public static void main(String[] args) {

		Mammiferes m1 = new Mammiferes("Simba", RaceEnum.LION, SexeEnum.MALE, "01");
		Mammiferes m2 = new Mammiferes("Lana", RaceEnum.LION, SexeEnum.FEMELLE, "02");
		Mammiferes m3 = new Mammiferes("Zou", RaceEnum.ZEBRE, SexeEnum.MALE, "210");
		Mammiferes m4 = new Mammiferes("Nanou", RaceEnum.ZEBRE, SexeEnum.FEMELLE, "215");
		Mammiferes m5 = new Mammiferes("Tigrou", RaceEnum.TIGRE, SexeEnum.MALE, "650");
		Mammiferes m6 = new Mammiferes("Sharkan", RaceEnum.TIGRE, SexeEnum.MALE, "620");
		

		m1.setAnimalAccouple(m2);
		System.out.println(m1.toString());

		m2.setAnimalAccouple(m1);
		System.out.println(m2.toString());

		m3.setAnimalAccouple(m4);
		System.out.println(m3.toString());

		m4.setAnimalAccouple(m3);
		System.out.println(m4.toString());

		m5.setAnimalAccouple(m6);
		System.out.println(m5.toString());

		m6.setAnimalAccouple(m2);
	
		System.out.println(m6.toString());

	}

}
