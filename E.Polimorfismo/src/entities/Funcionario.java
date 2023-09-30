package entities;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	
	private String name;
	protected Double horas;
	protected Double valorHr;
	
	List<Funcionario> funcionario = new ArrayList<>();
	
	public Funcionario(String name, Double horas, Double valorHr) {
		this.name = name;
		this.horas = horas;
		this.valorHr = valorHr;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHoras() {
		return horas;
	}

	public void setHoras(Double horas) {
		this.horas = horas;
	}

	public Double getValorHr() {
		return valorHr;
	}

	public void setValorHr(Double valorHr) {
		this.valorHr = valorHr;
	}
	
	public List<Funcionario> getLista() {
		return funcionario;
	}
	
	public double payment() {
		return horas * valorHr;
	}
	
	

}
