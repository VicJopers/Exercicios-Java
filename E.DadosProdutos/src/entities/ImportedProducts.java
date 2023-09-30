package entities;

public class ImportedProducts extends Product {
	
	private Double customsFree;

	public ImportedProducts(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}

	public double totalPrice() {
		return getPrice() + customsFree;
	}
	
	public String priceTag() {
		return "Nome do produto: "+getName() +
				"\n Preço: " +
				getPrice() +"\n Taxa de importação: "+
				customsFree;
	}

}
