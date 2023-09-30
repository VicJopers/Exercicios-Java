package entities;

public class OrderItem {
	
	private Integer quantidade;
	private Double price;
	private Produtos produto;
	
	public OrderItem(Integer quantidade, Double price, Produtos produto) {
		this.quantidade = quantidade;
		this.price = price;
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Produtos getProduto() {
		return produto;
	}
	public void setProduto(Produtos produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		 return price*quantidade;	 
	}
	@Override
	public String toString() {
		return produto.getName()
				+", $"+String.format("%.2f", price)
				+", Quantidade: "
				+ quantidade
				+", subtotal: "
				+"$"+String.format("%.2f", subTotal())+"\n";
		
	}
	
	

}
