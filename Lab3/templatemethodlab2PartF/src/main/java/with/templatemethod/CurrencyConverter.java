package with.templatemethod;

public class CurrencyConverter {
	public double convertToDollars(double amount, String currency) {
		System.out.println("Convert "+amount+" "+currency+" to US dollars");
		if (currency.contentEquals("EUR")) {
			return amount * 1.1;
		}
		if (currency.contentEquals("INR")) {
			return amount * 0.014;
		}
		if (currency.contentEquals("USD")) {
			return amount;
		}

		return 0.0;
	}

}
