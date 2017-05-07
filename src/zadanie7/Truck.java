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
			System.out.println("Cena Trucka po 10% zni¿ce wynosi: " + newPrice+"z³");
		} else {
			System.out.println("Zni¿ka nie przys³uguje.");
		}
	}

	public void printDetails() {
		System.out.println("Prêdkoœæ samochodu to: " + getSpeed()
				+ "km/h, cena regularna to: " + getPrice() + "z³. Kolor: "
				+ getColor());
	}
}
