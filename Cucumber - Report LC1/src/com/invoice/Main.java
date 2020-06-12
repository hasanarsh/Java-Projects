package com.invoice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Transaction type :\n1.Credit card\n2.Cheque\nEnter your choice :");
		int ch = Integer.parseInt(buff.readLine());
		System.out.println("Enter the transaction amount :");
		double amount = Double.parseDouble(buff.readLine());
		System.out.printf("Net amount : %.2f",new InvoiceBO().getAmountWithTax(ch, amount));
	}
}