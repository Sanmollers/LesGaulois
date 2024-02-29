package village;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;

	public Village(String nom, Chef chef) {
		this.nom = nom;
		this.chef = chef;
		this.villageois.length() = nbVillageois ;
		villageois = new Gaulois[nbVillageoisMaximum];
		
	}
	public void ajouterHabitant(Gaulois gaulois, Gaulois[] villageois) {
		// TODO Auto-generated method stub

	}

	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

}
