package entities;

public class PessoaFisica extends Taxa {
	
	private Double gastosComSaude;
	
	public PessoaFisica() {}

	public PessoaFisica(String nome, Double randaAnual, Double gastosComSaude) {
		super(nome, randaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double tax() {
		if(getRendaAnual()<20000.0) {
			return getRendaAnual() * 0.15 - getGastosComSaude() * 0.5;
		}else {
			return getRendaAnual() * 0.25 - getGastosComSaude() * 0.5;
		}
	}

	
	
}
