package Entities;

public class Back {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Back(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void aumentoSalario(double percentege) {
		salario = salario + salario * percentege/100.0;
		return;
	}
	public String toString() {
		return id + ", "+ nome + ", "+ String.format("%.2f ", salario);
	}

}
