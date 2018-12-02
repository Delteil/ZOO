package zoo;

/**
 * 
 * @author Amandine Delteil
 *
 */

public enum RaceEnum {
	
	LION("lion"),
	TIGRE("tigre"),
	ZEBRE("zebre"),
	CHIMPANZE("chimpanze"),
	RAIE("raie");
	
	
	private String nom  = "";
	
	private RaceEnum (String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
