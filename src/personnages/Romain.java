package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement=0;
	

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
		equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int force1 = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert force1>force;
	}
	

	public void  sEquiper (Equipement equipement) {
		switch (nbEquipement) {
		case 0: {
			System.out.println("Le soldat "+nom+" s'équipe avec un "+ equipement+".");
			equipements[nbEquipement]=equipement;
			nbEquipement++;
			break;

		}
		case 1: {
			if (equipements[nbEquipement-1]==equipement) {
				System.out.println("Le soldat "+nom+" possede déja un "+ equipement+".");
			}
			else {
				equipements[nbEquipement]=equipement;
				System.out.println("Le soldat "+nom+" s'equipe d'un "+ equipement+".");
				System.out.println("Le soldat "+ nom +" est déjà bien protégé!");
				nbEquipement++;
				break;
			}
		}
		default:
			break;
		}

	}

	public static void main(String[] args) {
		Romain romus = new Romain("Romus", 6);
		System.out.println(romus.prendreParole());
		romus.parler("C'est Romus qui parle !");
		romus.recevoirCoup(2);
		System.out.println(Equipement.BOUCLIER+"\n"+Equipement.CASQUE);
		romus.sEquiper(Equipement.BOUCLIER);
		romus.sEquiper(Equipement.BOUCLIER);
		romus.sEquiper(Equipement.CASQUE);
	}
}
