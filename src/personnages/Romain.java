package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
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
<<<<<<< HEAD
		assert force>0;
=======
		assert force > 0;
>>>>>>> 738e551ed80036f60690b44806d1bcc89e97c070
		int force1 = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
<<<<<<< HEAD
		assert force1>force;
=======
		assert force < force1;

>>>>>>> 738e551ed80036f60690b44806d1bcc89e97c070
	}

	public static void main(String[] args) {
		Romain romus = new Romain("Romus", -6);
		System.out.println(romus.prendreParole());
		romus.parler("C'est Romus qui parle !");
		romus.recevoirCoup(2);
	}
}
