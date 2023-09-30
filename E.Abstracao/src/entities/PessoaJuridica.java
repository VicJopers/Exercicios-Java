package entities;

public class PessoaJuridica extends Taxa{

	private Integer numFun;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFun) {
		super(nome, rendaAnual);
		this.numFun = numFun;
	}

	public Integer getNumFun() {
		return numFun;
	}

	public void setNumFun(Integer numFun) {
		numFun = numFun;
	}

	@Override
	public double tax() {
		
		if(getNumFun() >= 10) {
			return getRendaAnual()*0.14;
		}else {
			return getRendaAnual() * 0.16;
		}
	}
	
	
	
}
