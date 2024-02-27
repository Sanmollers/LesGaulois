package histoire;

//import personnages.Chef;
//import personnages.Druide;
//import personnages.Gaulois;
//import personnages.Romain;
//import personnages.Village;

import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 2);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU.. UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
