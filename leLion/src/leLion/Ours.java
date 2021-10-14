package leLion;

public class Ours extends Predateur implements OursAction{
	
	
	public  int facteurDagressivite;
	public int puissance;
	public StatutDhivernation statutDhivernation;
	
	enum StatutDhivernation {enCours ,terminée}
	
	
	public Ours() {
	}

	public Ours(String sexe, Categorie categorie, int force, Appartenance appartenance) {
		super(sexe, categorie, force, appartenance);
	}
   
	public Ours(int facteurDagressivite, int puissance, StatutDhivernation statutDhivernation) {
		this.facteurDagressivite = facteurDagressivite;
		this.puissance = puissance;
		this.statutDhivernation = statutDhivernation;
	}

	public int getFacteurDagressivite() {
		return facteurDagressivite;
	}

	public void setFacteurDagressivite(int facteurDagressivite) {
		this.facteurDagressivite = facteurDagressivite;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public StatutDhivernation getStatutDhivernation() {
		return statutDhivernation;
	}

	public void setStatutDhivernation(StatutDhivernation statutDhivernation) {
		this.statutDhivernation = statutDhivernation;
	}
	

	@Override
	public String SeNourrir() {
        return "omnivore";		
	}

	@Override
	public String Chasser() {
		return "seul";
		
	}

	@Override
	public void Courrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SeReproduire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String EmettreSon() {
		return "hurle";
		
		
	}

	@Override
	public void AfficheCaracteristique() {
		    System.out.println(" Ours { "); 
	        System.out.println("    facteurDomination:     " + this.getFacteurDagressivite());
	        System.out.println("    rang:    " + this.getPuissance());
	        System.out.println("    facteurDimpetuosite:       " + this.getStatutDhivernation());
	        System.out.println("    sexe:       " + this.getSexe());
	        System.out.println("    categorie:       " + this.getCategorie());
	        System.out.println("    force:    " + this.getForce());
	        System.out.println("    appartenance:    " + this.getAppartenance());
	        System.out.println("}");
		
		
	}

	@Override
	public void Grimper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Creuser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hiverner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Hurler() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	

	
	
	
	

}
