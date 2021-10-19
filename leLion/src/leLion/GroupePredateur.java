package leLion;

public abstract class GroupePredateur implements GroupePredateurAction {
	
	private int taille;
	private String ZoneGeographique;
	
	
	public GroupePredateur(int taille, String zoneGeographique) {
		this.taille = taille;
		ZoneGeographique = zoneGeographique;
	}


	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}


	public String getZoneGeographique() {
		return ZoneGeographique;
	}


	public void setZoneGeographique(String zoneGeographique) {
		ZoneGeographique = zoneGeographique;
	}
	
	
	

}

