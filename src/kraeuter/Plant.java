package kraeuter;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Plant {
	private String name;
	private double size;
	private double waterPerDay;
	private double growthPerDay;
	private LocalTime lastWateringTime;
	private LocalDate lastWateringDate;

	public Plant(String name, double size, double waterPerDay, double growthPerDay) {
		this.name = name;
		this.size = size;
		this.waterPerDay = waterPerDay;
		this.growthPerDay = growthPerDay;
	}

	public void watering() {
		this.lastWateringDate = LocalDate.now();
		this.lastWateringTime = LocalTime.now();
	}

	// toString for Plant
//	public String toString() {
//		
//		return "Der Name der Pflanze lautet " + this.name + ", sie ist " + this.size + " cm groﬂ, braucht "
//				+ this.waterPerDay + " Liter Wasser am Tag, w‰chst " + this.growthPerDay + " cm pro Tag und wurde am "
//				+ this.lastWateringDate + " um " + this.lastWateringTime + " Uhr gegossen.";
//	}
	
    public String toString() {
        String result = "Der Name der Pflanze lautet " + this.name + ", sie ist " + this.size + " cm groﬂ, braucht "
                + this.waterPerDay + " Liter Wasser am Tag, w‰chst " + this.growthPerDay + " cm pro Tag";
        
        if (this.lastWateringDate == null || this.lastWateringTime == null) {
            result += " und wurde noch nicht gegossen.";
        } else {
        	
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d.M");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("H:mm");

            String formattedDate = this.lastWateringDate.format(dateFormatter);
            String formattedTime = this.lastWateringTime.format(timeFormatter);
        	
            result += " und wurde am " + formattedDate + " um " + formattedTime + " Uhr gegossen.";
        }

        return result;
    }

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getWaterPerDay() {
		return waterPerDay;
	}

	public void setWaterPerDay(double waterPerDay) {
		this.waterPerDay = waterPerDay;
	}

	public double getGrowthPerDay() {
		return growthPerDay;
	}

	public void setGrowthPerDay(double growthPerDay) {
		this.growthPerDay = growthPerDay;
	}
	
	public LocalDate getLastWateringDate() {
		return lastWateringDate;
	}

	public void setLastWateringDate(LocalDate lastWateringDate) {
		this.lastWateringDate = lastWateringDate;
	}

	public LocalTime getLastWateringTime() {
		return lastWateringTime;
	}

	public void setLastWatering(LocalTime lastWateringTime) {
		this.lastWateringTime = lastWateringTime;
	}
}
