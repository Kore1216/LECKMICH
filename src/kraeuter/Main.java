package kraeuter;

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
