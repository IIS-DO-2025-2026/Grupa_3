package abstractFactory;

import simpleFactory.Bill;

public class WorkBillFactory extends BillFactory{

	@Override
	public Bill createBill(String type) {
		if(type.equals("tax"))
			return new TaxBill();
		else if(type.equals("VAT"))
			return new VatBill();
		return null;
	}

}