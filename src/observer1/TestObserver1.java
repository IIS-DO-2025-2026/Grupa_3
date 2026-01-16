package observer1;

public class TestObserver1 {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		UpdateSMS updateSMS = new UpdateSMS();
		
		cryptoCurrencyPrice.addObserver(updateSMS);
		
		cryptoCurrencyPrice.setBitcoinPrice(100000);
		cryptoCurrencyPrice.setEtherPrice(50000);

	}

}
