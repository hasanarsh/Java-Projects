package com.invoice;
public class InvoiceBO {
	public double getAmountWithTax(int ch,double amount) {
		if(ch==1) {
			return amount+(amount*(5.0/100.0));
		}
		else {
			return amount+(amount*(3.0/100.0));
		}
	}
}