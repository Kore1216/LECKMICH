package kraeuter;

import java.time.*;
import java.time.format.DateTimeFormatter;;

public class Rose extends Plant {
	public enum Farbe {
		SCHWARZ, WEIﬂ, ROT, GELB, LILA, BLAU, PINK
	}

	private Farbe farbe;

	public Rose(String name, double size, double waterPerDay, double growthPerDay, Farbe farbe) {
		super(name, size, waterPerDay, growthPerDay);
		this.farbe = farbe;

	}

	public String toString() {
		String result = "Der Name der Rose lautet " + getName() + ", sie ist " + getSize() + " cm groﬂ, braucht "
				+ getWaterPerDay() + " Liter Wasser am Tag, w‰chst " + getGrowthPerDay() + " cm pro Tag, ist "
				+ farbeToString();

		if (getLastWateringDate() == null || getLastWateringTime() == null) {
			result += " und wurde noch nicht gegossen.";
		} else {
			DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d.M");
			DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("H:mm");

			String formattedDate = getLastWateringDate().format(dateFormatter);
			String formattedTime = getLastWateringTime().format(timeFormatter);

			result += " und wurde am " + formattedDate + " um " + formattedTime + " Uhr gegossen.";

			
		}
		return result;
	}

	// ‹berpr¸ft die Farbe der Rose und konkateniert dies dann mit der
	// toString-Methode, damit die Ausgabe ebenfalls die Farbe der Rose angibt.
	private String farbeToString() {
		switch (this.farbe) {
		case SCHWARZ:
			return "schwarz";
		case WEIﬂ:
			return "weiﬂ";
		case ROT:
			return "rot";
		case GELB:
			return "gelb";
		case LILA:
			return "lila";
		case BLAU:
			return "blau";
		case PINK:
			return "pink";
		}
		return "farblos";
	}

//    private String farbeToString() {
//        switch (this.farbe) {
//            case SCHWARZ: return "schwarz";
//            case WEIﬂ: return "weiﬂ";
//            case ROT: return "rot";
//            case GELB: return "gelb";
//            case LILA: return "lila";
//            case BLAU: return "blau";
//            case PINK: return "pink";
//            default: return this.farbe.toString().toLowerCase();
//        }
//    }

	// Getters and Setters
	public Farbe getFarbe() {
		return farbe;
	}

	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}

}
