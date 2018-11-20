package zoo;

public class Zoo {

	// Attribut Zones
	private Zones[] zones;

	public Zones[] getZones() {
		return zones;
	}

	public void setZones(Zones[] zones) {
		this.zones = zones;
	}

	public Zoo(Zones[] zones) {
		super();
		this.zones = zones;
	}

}
