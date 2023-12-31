package entities;

public class BusinesAccount extends Account {
	
	private Double loanLimit;
	
	public BusinesAccount() {
	}

	public BusinesAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
		deposit(amount);
		}
	}
	
	public void withDraw(double amount) {
		super.withDraw(amount);
		balance -=2.0;
	}

}
