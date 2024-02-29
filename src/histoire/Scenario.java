package histoire;

//import personnages.Chef;
//import personnages.Druide;
//import personnages.Gaulois;
//import personnages.Romain;
//import personnages.Village;

import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 2);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix",25);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);

	}

}
