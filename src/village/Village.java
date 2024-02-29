package village;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;

	public Village(String nom, Chef chef, int nbVillageoisMaximum) {
		this.nom = nom;
		this.chef = chef;
		villageois = new Gaulois[nbVillageoisMaximum];

	}

	public void ajouterHabitant(Gaulois gaulois, Gaulois[] villageois) {
		if (villageois.length <= nbVillageoisMaximum) {
			System.out.println("Le village comporte " + villageois.length + " habitant(s)./n" + villageois);
		} else {
			System.out.println("Le Village est plein !");
		}

	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

}
