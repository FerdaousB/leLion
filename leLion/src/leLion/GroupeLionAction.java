package leLion;

import java.util.ArrayList;
import java.util.List;

import leLion.GroupeLion.FacteurDominationMale;
import leLion.Lion.FacteurDomination;

public interface GroupeLionAction {

	public void ConstituerCoupleDominant(FacteurDomination facteurDominationMale, String S);
	public void ReproductionLions(ArrayList<Lion> lions);
	public String DeclarerLionNonDominant(FacteurDominationMale facteurDominationMale);
}
