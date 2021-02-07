class Currency {
	private String currencyName;
	private int amount;
	public Currency(String currencyName, int amount ) {
		this.currencyName = currencyName;
		this.amount = amount;
	}
	public void add(Currency that) throws CurrencyNameDoNotMatchException {
		if(!this.currencyName.equals(that.currencyName)) {
			throw new CurrencyNameDoNotMatchException("Currency names "+this.currencyName+" and "+that.currencyName+" are different");
		}
		this.amount = this.amount + that.amount;
	}
	public String toString() {
		return amount + " " + currencyName;
	}
}
class CurrencyNameDoNotMatchException extends Exception {
	public CurrencyNameDoNotMatchException(String message) {
		super(message);
	}
}
public class OurOwnException {
	public static void main(String[] args) throws CurrencyNameDoNotMatchException {
		Currency currency1 = new Currency ("USD", 10);
		Currency currency2 = new Currency ("INR", 7);
		currency1.add(currency2);
		System.out.println(currency1);
	}
}