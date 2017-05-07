package zadanie7;

public class Sedan extends Car {
	private int length;

	public Sedan(double speed, double price, String color) {
		super(speed, price, color);
		length = 0;
	}

	public void getSalePrice(int length) {
		if (length < 4500) {
			double newPrice = getPrice() - ((getPrice() * 10) / 100);
			System.out.println("Cena Sedana po zni¿ce wynosi: "+newPrice+"z³");
		} else {
			System.out.println("Zni¿ka nie przys³uguje.");
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void printDetails() {
		System.out.println("Prêdkoœæ samochodu to: " + getSpeed()
				+ "km/h, cena regularna to: " + getPrice() + "z³. Kolor: "
				+ getColor());
	}
}
