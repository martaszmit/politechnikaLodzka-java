package zadanie7;

public class Truck extends Car {
	private double weight;

	public Truck(double speed, double price, String color) {
		super(speed, price, color);
		weight = 0;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void getSalePrice(double weight) {
		if (weight > 3000) {
			double newPrice = getPrice() - ((getPrice() * 10) / 100);
			System.out.println("Cena Trucka po 10% zni�ce wynosi: " + newPrice+"z�");
		} else {
			System.out.println("Zni�ka nie przys�uguje.");
		}
	}

	public void printDetails() {
		System.out.println("Pr�dko�� samochodu to: " + getSpeed()
				+ "km/h, cena regularna to: " + getPrice() + "z�. Kolor: "
				+ getColor());
	}
}
