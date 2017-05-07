package zadanie4;

public class Invoice {
	private int id;
	private String description;
	private int quantity;
	private double price;

	public Invoice() {

	}

	public Invoice(int id, String description, int quantity, double price) {
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		this.price = price;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getInvoiceAmount() {

		return this.price * this.quantity;

	}

	public void showDetails() {
		System.out.println("Zam�wi�e� produkt o ID: " + this.id + ", w ilo�ci: "
				+ this.quantity + " sztuk, w cenie: " + this.price
				+ "z�. Warto�� Twojego zam�wienia to: "
				+ this.getInvoiceAmount());
	}

	public static void main(String[] args) {

		Invoice fv = new Invoice(1, "desc1", 2, 4);
		fv.showDetails();
	}

}
