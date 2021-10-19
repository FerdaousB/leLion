package leLion;

import java.util.Scanner;

import leLion.GroupeLion.FacteurDominationMale;

public class Lion extends Predateur implements LionAction, PredateurAction{
	
	public static int next_id = 0;
	public FacteurDomination facteurDomination;
	public Rang rang;
	public int facteurDimpetuosite;
	
	enum FacteurDomination {Dominant , NonDominant };
	enum Rang {APLHA ,BETA, GAMA, OMEGA};
	
	
	public Lion() { 
		super();
	}


	public Lion(FacteurDomination facteurDomination, Rang rang, int facteurDimpetuosite) {
		this.facteurDomination = facteurDomination;
		this.rang = rang;
		this.facteurDimpetuosite = facteurDimpetuosite; 
		
	}

	
	public Lion(String sexe, Categorie categorie, int force, Appartenance appartenance,
			FacteurDomination facteurDomination, Rang rang, int facteurDimpetuosite) {
		super(sexe, categorie, force, appartenance);
		this.facteurDomination = facteurDomination;
		this.rang = rang;
		this.facteurDimpetuosite = facteurDimpetuosite;
	}


	

	

	public Lion(FacteurDomination dominant) {
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
		return "Viande";
	}


	@Override
	public String Chasser() {
		return "Groupe";
	}

	@Override
	public void Courrir() {}
	

	@Override
	public void SeReproduire() {}
	

	@Override
	public void EntendreSon() {}
	
	
	@Override
	public void SeSeparerDegroupe() {}
	

	@Override
	public String Rugir(String paroles) {

		 return paroles;
	}
	

	@Override
	public void AfficheCaracteristique() {
		
	        System.out.println(" Ce Lion a les caractéristiques suivantes : { Sexe : " + this.getSexe());
	        System.out.println("                                              Catégorie : " + this.getCategorie());
	        System.out.println("                                              Rang : " + this.getRang());
	        System.out.println("                                              Appartenance : " + this.getAppartenance());
	        System.out.println("                                              Facteur Domination : " + this.getFacteurDomination());
	        System.out.println("                                              Nourriture : " + this.SeNourrir());
	        System.out.println("                                              Chasser: " + this.Chasser());
	        System.out.println("                                              Force: " + this.getForce() + " }");
		}

	
	
	@Override
	public void EmettreSon() {
		int puissanceSon;
		Scanner sc = new Scanner(System.in);

		 System.out.println("    --- Entrez la puissance du son pour savoir le type de rugissement de lion ---");
         System.out.println("");
         System.out.println(" Puissance = 10 : Exprime la soumission");
         System.out.println(" Puissance = 50 : Exprime l’appartenance à un groupe");
         System.out.println(" Puissance = 70 : Exprime la domination");
         System.out.println(" Puissance = 90 : Exprime l’agressivité");
         
         puissanceSon = sc.nextInt();

		switch(puissanceSon)
		{
		 case 10:
             System.out.println(" => Cettes puissance exprime la soumission");
             break;
		 case 50:
             System.out.println(" => Cettes puissance exprime l’appartenance à un groupe");
             break; 
         case 70:
             System.out.println(" => Cettes puissance exprime la domination");
             break;
         case 90:
             System.out.println(" => Cettes puissance exprime l’agressivité");
             break;		
		}
		
	}

	

	@Override
	public String toString() {		
	
	 return" Lion "+ ++Lion.next_id +" [  Sexe = " + getSexe() + " | Catégorie = " + getCategorie() +
			 " | Facteur Domination = " +facteurDomination + " | Rang = " + rang + " | Facteur D'impétusité = " + facteurDimpetuosite +
		  " | Nourriture = " + SeNourrir() + " | Chasser = " + Chasser()+"  ]";}
	
}


	
	
	
	
	
	
	
	
	
	
	
	



