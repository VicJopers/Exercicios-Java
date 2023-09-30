package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Cliente cliente;
	
	List<OrderItem> itens = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Cliente cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getItens() {
		return itens;
	}

	public void AddItem(OrderItem adicionandoItem) {
		itens.add(adicionandoItem);
	}
	
	public void RemoveItem(OrderItem removendoItem) {
		itens.remove(removendoItem);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem item: itens) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment)+"\n");
		sb.append("Order Status: ");
		sb.append(status+"\n");
		sb.append("Cliente: \n");
		sb.append(cliente+"\n");
		sb.append("OrderItem\n");
		for(OrderItem item: itens) {
			sb.append(item);
		}
		sb.append("TotalItens\n");
		sb.append("$"+String.format("%.2f", total()));
		return sb.toString();
	}
}
