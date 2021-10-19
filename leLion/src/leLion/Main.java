package leLion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leLion.GroupeLion.FacteurDominationMale;
import leLion.Lion.FacteurDomination;
import leLion.Lion.Rang;
import leLion.Ours.StatutDhivernation;
import leLion.Predateur.Appartenance;
import leLion.Predateur.Categorie;

public class Main {

	public static void main(String[] args) {
		
		// Construction de deux Objets : Lion et Ours ==> Affichage de leurs caractéristiques 
		
		Lion l1 = new Lion("Male",Categorie.Jeune, 70, Appartenance.Groupe, FacteurDomination.NonDominant, Rang.APLHA, 30);
		Ours O1 = new Ours("Female",Categorie.Adulte, 20, Appartenance.Solitaire, 10, 50, StatutDhivernation.EnCours);
		l1.AfficheCaracteristique(); 
        System.out.println("");
		O1.AfficheCaracteristique();
        System.out.println("");
        
        // Affichage de type de Rugissements de lion et de Hurlements d'ours à partir de puissance de leurs son
        
        l1.EmettreSon();
        System.out.println("");
        O1.EmettreSon();
        
        // Creation de Lions 
        
		Lion l2 = new Lion("Female",Categorie.Jeune, 60, Appartenance.Groupe, FacteurDomination.Dominant, Rang.APLHA, 40);
		Lion l3 = new Lion("Male",Categorie.Vieux, 30, Appartenance.Groupe, FacteurDomination.NonDominant, Rang.BETA, 60);
		Lion l4 = new Lion("Female",Categorie.Adulte, 70, Appartenance.Groupe, FacteurDomination.Dominant, Rang.APLHA, 80);
		Lion l5 = new Lion("Male",Categorie.Jeune, 50, Appartenance.Groupe, FacteurDomination.NonDominant, Rang.GAMA, 50);
		Lion l6 = new Lion("Female",Categorie.Adulte, 90, Appartenance.Groupe, FacteurDomination.NonDominant, Rang.GAMA, 80);
		Lion l7 = new Lion("Male",Categorie.Adulte, 80, Appartenance.Groupe, FacteurDomination.Dominant, Rang.BETA, 70);
		Lion l8 = new Lion("Female",Categorie.Vieux, 70, Appartenance.Groupe, FacteurDomination.Dominant, Rang.APLHA, 90);
		Lion l9 = new Lion("Male",Categorie.Jeune, 20, Appartenance.Groupe, FacteurDomination.NonDominant, Rang.GAMA, 40);
		Lion l10 = new Lion("Female",Categorie.Adulte, 50, Appartenance.Groupe, FacteurDomination.NonDominant, Rang.BETA, 60);
		Lion l11 = new Lion("Female",Categorie.Jeune, 90, Appartenance.Groupe, FacteurDomination.Dominant, Rang.GAMA, 50);

		// Création d'un groupe de lions
		
		ArrayList<Lion> GroupeLion1 = new ArrayList<Lion>(); 
    	GroupeLion1.add(l1);
    	GroupeLion1.add(l2);
    	GroupeLion1.add(l3);
    	GroupeLion1.add(l4);
    	GroupeLion1.add(l5);
    	GroupeLion1.add(l6);
    	GroupeLion1.add(l7);

		ArrayList<Lion> GroupeLion2 = new ArrayList<Lion>(); 
    	GroupeLion2.add(l8);
    	GroupeLion2.add(l9);
    	GroupeLion2.add(l10);
    	GroupeLion2.add(l11);
    	
    	
        System.out.println("");
        System.out.println("           -----------------------------------------------------------             ");
        System.out.println("");
      

        
        
        //System.out.println("Aprés la creation du groupe de lion, voici les caractéristique du groupe Lion");
        //System.out.println("La taille de la list est: "+ GroupeLion.size());
        //System.out.println(GroupeLion.toString());
        
        
        System.out.println("");      
        System.out.println("  GROUPE 1  "); 
        System.out.println("");
        for (int i = 0; i < GroupeLion1.size(); i++) {
            System.out.println(GroupeLion1.get(i));
          }
        System.out.println("");      
        System.out.println("");  
        
        
        System.out.println("  GROUPE 2  "); 
        System.out.println("");
        for (int i = 0; i < GroupeLion2.size(); i++) {
            System.out.println(GroupeLion2.get(i));
          }
        System.out.println("");      
        System.out.println(" => Les caractéristiques du GROUPE 1   ");      
        GroupeLion GP1 = new GroupeLion (GroupeLion1.size(), "Afrique","Dominant", 70);
        GP1.AfficheCaracteristique();
        
        System.out.println("");      

        System.out.println(" => Les caractéristiques du GROUPE 2   ");      
        GroupeLion GP2 = new GroupeLion (GroupeLion2.size(), "Amerique","Dominant", 50);
        GP2.AfficheCaracteristique();

        
       // GP1.ConstituerCoupleDominant(FacteurDomination.Dominant,"Male");

		

	}

}
