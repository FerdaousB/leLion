package leLion;

import java.util.Scanner;

public class Ours extends Predateur implements OursAction{
	
	
	public  int facteurDagressivite;
	public int puissance;
	public StatutDhivernation statutDhivernation;
	
	enum StatutDhivernation {EnCours ,terminée}
	
	
	public Ours(String sexe, Categorie categorie, int force, Appartenance appartenance) {
		super(sexe, categorie, force, appartenance);
	}
   
	
	public Ours(String sexe, Categorie categorie, int force, Appartenance appartenance, int facteurDagressivite,
			int puissance, StatutDhivernation statutDhivernation) {
		super(sexe, categorie, force, appartenance);
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
	public void Courrir() {}

	@Override
	public void SeReproduire() {}

	@Override
	public void Grimper() {	}

	@Override
	public void Creuser() {}

	@Override
	public void Hiverner() {}

	@Override
	public void Hurler() {}
	
	@Override
	public String SeNourrir() {
        return "Omnivore";		
	}

	@Override
	public String Chasser() {
		return "Seul";
		
	}
	
	@Override
	public void AfficheCaracteristique() {
        System.out.println(" Ce Ours a les caractéristiques suivantes : { Sexe : " + this.getSexe());
        System.out.println("                                              Catégorie : " + this.getCategorie());
        System.out.println("                                              Appartenance : " + this.getAppartenance());
        System.out.println("                                              Statut D'hivernation : " + this.getStatutDhivernation());
        System.out.println("                                              Nourriture :  " + this.SeNourrir());
        System.out.println("                                              Chasser : " + this.Chasser());
	    System.out.println("                                              Puissance : " + this.getPuissance());
	    System.out.println("                                              Force : " + this.getForce());
	    System.out.println("                                              Facteur D'agréssivité : " + this.getStatutDhivernation() +" }");
		
	}
	@Override
	public void EmettreSon() {
		int puissanceSon;
		Scanner sc = new Scanner(System.in);

		 System.out.println("   --- Entrez la puissance du son pour savoir le type de Hurlements de Ours --- "); 
         System.out.println("");
         System.out.println(" Puissance = 10 : Exprime la soumission");
         System.out.println(" Puissance = 50 : Exprime l’appartenance à un groupe");
         System.out.println(" Puissance = 70 : Exprime la domination");
         System.out.println(" Puissance = 90 : Exprime l’agressivité");
         puissanceSon = sc.nextInt();

		switch(puissanceSon)
		{
		 case 10:
             System.out.println(" => Cettes puissance exprime la peur");
             break;
		 case 50:
             System.out.println(" => Cettes puissance exprime sa présence");
             break;
         case 70:
             System.out.println(" => Cettes puissance exprime un autre prédateur");
             break;
         case 90:
             System.out.println(" => Cettes puissance exprime l’agressivité");
             break;		
		}
		
	}

	
	
	
	
	
	
	
	
	

	
	
	
	

}
