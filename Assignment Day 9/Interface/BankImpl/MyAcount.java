package com.bankImpl.demo;

public class MyAcount {

	public static void main(String[] args) {
		SavingsAccount pavan=new SavingsAccount();
		pavan.createAcc();
		pavan.calInt();
		pavan.setDeposit(40000);
		pavan.deposit();
		pavan.setWithdraw(10000);
		pavan.withDraw();
		pavan.getBalance();
		
		SavingsAccount poppy=new SavingsAccount();
		poppy.createAcc();
		poppy.calInt();
		poppy.setDeposit(100000);
		poppy.deposit();
		poppy.setWithdraw(5000);
		poppy.withDraw();
		poppy.getBalance();
		
		
		PersonalLoanAccount anup=new PersonalLoanAccount();
		anup.createAcc();
		anup.setPrincipal(500000);
		anup.payInterest();
		anup.calInt();
		anup.repayPrincipal();
		anup.payPartialPrincipal();
		
		HouseLoanAccount gnan=new HouseLoanAccount();
		gnan.createAcc();
		gnan.setPrincipal(1200000);
		gnan.payInterest();
		gnan.calInt();
		gnan.repayPrincipal();
		gnan.payPartialPrincipal();
	}

}
