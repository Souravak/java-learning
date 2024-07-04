package com.srv.exceptionhandling;

class Amount{
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	
	public void add(Amount that){
		if(!this.currency.equals(that.currency)) {
			//throw new RuntimeException("Currencies Don't Match");
			throw new CurrenciesDoNotMatchException("Currencies Don't Match");
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
	
}

class CurrenciesDoNotMatchException extends RuntimeException{
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner{
	
	public static void main(String[] args){
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("INR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}
}
