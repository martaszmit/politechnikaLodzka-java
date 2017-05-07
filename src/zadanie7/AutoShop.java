package zadanie7;

public class AutoShop {

	public static void main(String[] args) {
		Sedan sedan = new Sedan(300, 4500, "Czerwony");
		Truck truck = new Truck(300, 4500, "Czarny");
		Hatchback hatchback = new Hatchback(300, 4500, "Czarny");
		sedan.printDetails();
		sedan.getSalePrice(3500);
		truck.printDetails();
		truck.getSalePrice(5000);
		hatchback.printDetails();
		hatchback.getSalePrice(100);

	}

}
