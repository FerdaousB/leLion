package leLion;


public class Lion extends Predateur implements LionAction{
	
	public FacteurDomination facteurDomination;
	public Rang rang;
	public int facteurDimpetuosite;
	
	
	enum FacteurDomination {dominant , nondominant };
	enum Rang {APLHA ,BETA, GAMA, OMEGA};
	
	
	public Lion() {
	}


	public Lion(FacteurDomination facteurDomination, Rang rang, int facteurDimpetuosite) {
		this.facteurDomination = facteurDomination;
		this.rang = rang;
		this.facteurDimpetuosite = facteurDimpetuosite; 
		
	}


	public Lion(String sexe, Categorie categorie, int force, Appartenance appartenance) {
		super(sexe, categorie, force, appartenance);
		// TODO Auto-generated constructor stub
	}
	
	


	public FacteurDomination getFacteurDomination() {
		return facteurDomination;
	}


	public void setFacteurDomination(FacteurDomination facteurDomination) {
		this.facteurDomination = facteurDomination;
	}


	public Rang getRang() {
		return rang;
	}


	public void setRang(Rang rang) {
		this.rang = rang;
	}


	public int getFacteurDimpetuosite() {
		return facteurDimpetuosite;
	}


	public void setFacteurDimpetuosite(int facteurDimpetuosite) {
		this.facteurDimpetuosite = facteurDimpetuosite;
	}


	@Override
	public String SeNourrir() {
		return "viande";
	}


	@Override
	public String Chasser() {
		return "groupe";
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
		return "rugit";
		// TODO Auto-generated method stub
		
	}


	@Override
	public void AfficheCaracteristique() {
		
		    System.out.println(" Lion { ");
	        System.out.println("    facteurDomination:     " + this.getFacteurDomination());
	        System.out.println("    rang:    " + this.getRang());
	        System.out.println("    facteurDimpetuosite:       " + this.getFacteurDimpetuosite());
	        System.out.println("    sexe:       " + this.getSexe());
	        System.out.println("    categorie:       " + this.getCategorie());
	        System.out.println("    force:    " + this.getForce());
	        System.out.println("    appartenance:    " + this.getAppartenance());
	        
	        System.out.println("}");
		
	}


	@Override
	public String Rugir(String paroles) {

		 return paroles;
	}


	@Override
	public void EntendreSon() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void SeSeparerDegroupe() {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
	
	
	
	
	
	
	
	


}
