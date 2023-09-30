package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.NivelFuncionario;

public class Funcionario {
	
	private String nome;
	private NivelFuncionario level;
	private Double salarioBase;	
	private Departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, NivelFuncionario level, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelFuncionario getLevel() {
		return level;
	}

	public void setLevel(NivelFuncionario level) {
		this.level = level;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}
	
	
	public void addContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double income (int year, int month) {
		Calendar cal = Calendar.getInstance();
		double sum = salarioBase;
		for(HoraContrato c: contratos) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1+cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	

}
