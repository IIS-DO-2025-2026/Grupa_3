package observer2;

public class TestObserver2 {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		UpdateSMS updateSMS = new UpdateSMS();
		
		cryptoCurrencyPrice.addObserver(updateSMS);
		
		cryptoCurrencyPrice.setBitcoinPrice(123000);
		cryptoCurrencyPrice.setEtherPrice(77000);

	}

}
