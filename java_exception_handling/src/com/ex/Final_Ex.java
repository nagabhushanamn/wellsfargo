package com.ex;

class AcountBalanceException extends RuntimeException {

	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		return "current balance :" + this.getAmount() + " - u cant txr";
	}

}

class Txr {

	public void doTxr(double amount, String fromAcc, String toAcc) throws AcountBalanceException {

		// load fromAcc

		// load toAcc

		double fromAccBaalnce = 1000.00;
		if (amount > fromAccBaalnce) {
			AcountBalanceException abe = new AcountBalanceException();
			abe.setAmount(fromAccBaalnce);
			throw abe;
		}

		// debit & credit

		// update bot accounts
		System.out.println("Txr success");

	}
}

public class Final_Ex {

	public static void main(String[] args) {

		Txr txr = new Txr();
		//try {
			txr.doTxr(20000, "1", "2");
		//} catch (AcountBalanceException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}

	}

}
