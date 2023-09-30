package entities;

public class Terceirizado extends Funcionario {
	
	private Double gastoAdicional;

	public Terceirizado(String name, Double horas, Double valorHr, Double gastoAdicional) {
		super(name, horas, valorHr);
		this.gastoAdicional = gastoAdicional;
	}

	public Double getGastoAdicional() {
		return gastoAdicional;
	}

	public void setGastoAdicional(Double gastoAdicional) {
		this.gastoAdicional = gastoAdicional;
	}
	
	
	@Override
	public double payment() {
		return super.payment()+gastoAdicional*1.1;
	}

}
