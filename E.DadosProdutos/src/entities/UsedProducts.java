package entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProducts extends Product {
	
	private LocalDate manufactureDate;
	

	public UsedProducts(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String priceTag() {
		return "Nome do produto: " + getName()
				+ "\n Preço: " + String.format("%.2f", getPrice())+"\n "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	

}
