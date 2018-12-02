package zoo;

/**
 * 
 * @author Delteil
 *
 */
public enum SexeEnum {

	FEMELLE("femelle"), MALE("male");

	private String nom = "";

	private SexeEnum(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return nom;
	}

}
