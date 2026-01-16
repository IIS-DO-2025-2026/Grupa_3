package observer3;


public class TestObserver3 {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		UpdateSMS updateSMS = new UpdateSMS();
		
		cryptoCurrencyPrice.addListener(updateSMS);
		
		cryptoCurrencyPrice.setBitcoinPrice(155500);
		cryptoCurrencyPrice.setEtherPrice(87000);

	}

}
