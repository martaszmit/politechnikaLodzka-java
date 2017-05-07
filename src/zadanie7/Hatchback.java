package zadanie7;

public class Hatchback extends Car {
	private int year;
	private int manufacturerDiscount;

	public Hatchback(double speed, double price, String color) {
		super(speed, price, color);
		year = 0;
		manufacturerDiscount = 0;
	}

	public void getSalePrice(int manufacturerDiscount) {
		double newPrice = getPrice() - manufacturerDiscount;
		System.out.println("Cena Hatchbacka po zni¿ce producenta wynosi: " + newPrice+"z³");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}

	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public void printDetails() {
		System.out.println("Prêdkoœæ samochodu to: " + getSpeed()
				+ "km/h, cena regularna to: " + getPrice() + "z³. Kolor: "
				+ getColor());
	}
}
