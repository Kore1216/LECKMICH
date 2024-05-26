package kraeuter;

// ToDo-List: Shop hinzuf�gen, in dem man diverse Pflanzen kaufen kann. Die Pflnzen werden einem Inventar zugeordnet 
// und von diesem Inventar aus k�nnen die Pfanzen dann gepflanzt werden. Reife Pflanzen k�nnen geerntet werden
// und verkauft werden, um noch sch�nere und teurere Pflanzen zu kaufen. Ein Feld kann benutzt werden, um gewinnbringend
// zB Weizen anzubauen und zu verkaufen.

public class Main {
	public static void main(String[] args) {
		Plant lemonika = new Plant("Lemonika", 5, 0.5, 0.8);
		System.out.println(lemonika.toString());

		lemonika.watering();
		System.out.println(lemonika.toString());

		Rose rose = new Rose("Rosi", 12, 0.3, 0.3, Rose.Farbe.SCHWARZ);
		System.out.println(rose.toString());

		rose.watering();
		System.out.println(rose.toString());
	}
}
