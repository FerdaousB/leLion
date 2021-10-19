package leLion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import leLion.GroupeLion.FacteurDominationMale;
import leLion.Lion.FacteurDomination;

public class GroupeLion extends GroupePredateur implements GroupeLionAction, GroupePredateurAction{
	
	private static int next_id1 = 0;
	private String typeCouple = "Dominant";
	private int Puissance;
	public FacteurDominationMale facteurDominationMale;
	
	
	enum FacteurDominationMale {Dominant ,NonDominant };

	
	private ArrayList<Lion> GroupeLion;
	private ArrayList<Predateur> GroupePredateur;

	
	
	public GroupeLion(int taille, String zoneGeographique) {
		super(taille, zoneGeographique);
	}

	
	public GroupeLion(int taille, String zoneGeographique, String typeCouple, int puissance) {
		super(taille, zoneGeographique);
		this.typeCouple = typeCouple;
		Puissance = puissance;
	}

	
	public String getTypeCouple() {
		return typeCouple;
	}
	

	public void setTypeCouple(String typeCouple) {
		this.typeCouple = typeCouple;
	}
	

	public int getPuissance() {
		return Puissance;
	}
	

	public void setPuissance(int puissance) {
		Puissance = puissance;
	}
	

	@Override
	public void EnlevePredateur(GroupePredateur P) {
		
		GroupePredateur.remove((GroupePredateur) P);
	}
	
	@Override
	public void AjoutPredateur(Predateur P) {
		
		GroupePredateur.add((Predateur) P);		
	}
	
	@Override
	public void ReproductionLions(ArrayList<Lion> lions) {
		GroupeLion = lions;
	}
	
	
	
	
	@Override
	public void ConstituerCoupleDominant(FacteurDomination facteurDomination, String S) {
	    
		List<Lion> Couple1 = Arrays.asList(new Lion[2]);
		
		
		Lion LionDominant = new Lion(FacteurDomination.Dominant);
		
		if(LionDominant.getSexe().equals(S))
			 
			 if (LionDominant.facteurDomination.equals(FacteurDomination.Dominant))
				 
			 System.out.println(" le couple est dominant ");
		    
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	@Override
	public String DeclarerLionNonDominant(FacteurDominationMale facteurDominationMale) {
		
		if (facteurDominationMale != facteurDominationMale.Dominant ) 
			
				System.out.println(" Le lion est non dominant ");
		
	  return "Non Dominant";
	}
	
	
	@Override
	public void AfficheCaracteristiqueGroupePredateur() {	
		System.out.println(" Les caractéristique du groupe lion sont {  Taille: " + this.getTaille());
        System.out.println("                                            Zone Geographique: " + this.getZoneGeographique() +   "}");	   
	 // System.out.println(" 	                       Taille: " + this.GroupeLion.size());
		 
	}
	
	

	@Override
	public void AfficheCaracteristique() {
        System.out.println("                                     {  Taille : " + this.getTaille());
        System.out.println("                                     Zone Geographique : " + this.getZoneGeographique());	  
        System.out.println("                                     Type Couple : " + this.getTypeCouple());	        
        System.out.println("                                     Puissance: " + this.getPuissance() +"  }");	
        
      
       

      
	}

	
	
	
	
	
	

}
