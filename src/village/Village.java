package village;

import java.util.Iterator;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];

	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois]=gaulois;
			nbVillageois++;
		} else {
			System.out.println("Le Village est plein !");
		}

	}
	public Gaulois trouverHabitant(int indiceGaulois) {
		Gaulois habitant = villageois[indiceGaulois];
		return habitant;
	}
	

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void afficherVillageois() {
		System.out.println("Dans "+nom+" du chef "+chef.getNom()+" vivent les legentaires gaulois :");
		for(int i = 0; i< nbVillageois ; i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village= new Village("Village des Irréductibles",30);
		Chef chef = new Chef("Abraracourcix",6,5,village);
		village.setChef(chef);
//		Gaulois gaulois = village.trouverHabitant(30); --> erreur:Index 30 out of bounds for length 30		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois); --> null il n'y a d'habitant à l'indice 1

		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}

}
