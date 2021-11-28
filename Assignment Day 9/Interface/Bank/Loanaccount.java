package com.bank.demo;

public interface Loanaccount extends Account {
	void repayPrincipal ();
	void payInterest ();
	void payPartialPrincipal ();
}
