package com.bank.demo;

public interface DebitInterest extends Interest {
	void deductMonthlyInt();
	void deductHalfYrlyInt();
	void deductAnnualInt();
}
