package com.bank.demo;

public interface DepositAccount extends Account {
	void withDraw();
	void deposit();
	void getBalance();
}
