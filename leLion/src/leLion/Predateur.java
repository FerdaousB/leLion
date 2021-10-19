package leLion;


public abstract class Predateur implements PredateurAction{

	private String sexe;
	private Categorie categorie;
	private int force;
	private Appartenance appartenance;
	private Nourriture nourriture;
	private EmettreSon emettreSon;
	
	enum Nourriture {viande ,omnivore };
	enum Categorie {Jeune ,Adulte, Vieux };
	enum Appartenance {Groupe ,Solitaire };
	enum typeDeChasse {seul ,groupe };
	enum EmettreSon {hurle ,rugit }
	
	public Predateur() {
	 }


	public Predateur(String sexe, Categorie categorie, int force, Appartenance appartenance) {
		this.sexe = sexe;
		this.categorie = categorie;
		this.force = force;
		this.appartenance = appartenance;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public int getForce() {
		return force;
	}


	public void setForce(int force) {
		this.force = force;
	}


	public Appartenance getAppartenance() {
		return appartenance;
	}


	public void setAppartenance(Appartenance appartenance) {
		this.appartenance = appartenance;
	}


	
	 
	
	
	
}
