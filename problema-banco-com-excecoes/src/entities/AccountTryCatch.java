package entities;

import exceptions.DomainException;

public class AccountTryCatch {
	
	private String holder;
	private Integer number;
	private Double balance;
	private Double withdrawLimit;
	
	public AccountTryCatch(String holder, Integer number, Double balance, Double withdrawLimit) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if(amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;
	}
}
