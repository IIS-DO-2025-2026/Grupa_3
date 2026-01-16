package observer3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

//observable = support
public class CryptoCurrencyPrice {
	private double bitcoinPrice;
	private double etherPrice;
	
	private PropertyChangeSupport propertyChangeSupport;
	
	public CryptoCurrencyPrice() {
		propertyChangeSupport = new PropertyChangeSupport(this);
	}
	
	public void addListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}
	
	public void removeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void setBitcoinPrice(double bitcoinPrice) {
		propertyChangeSupport.firePropertyChange("bitcoin", this.bitcoinPrice, bitcoinPrice);
		this.bitcoinPrice = bitcoinPrice;
	}

	public void setEtherPrice(double etherPrice) {
		propertyChangeSupport.firePropertyChange("ether", this.etherPrice, etherPrice);
		this.etherPrice = etherPrice;
	}
	
	
	

}
