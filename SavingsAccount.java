package com.caogemini;

public class SavingsAccount {
	private final long accountNumber; 
	private String name;
	private int initialAmount;
	private static long accountNumberGenerator;
	static {

		accountNumberGenerator = 110245600; 

	}

	//initialisers for account number that should be auto generated.

	{

		accountNumber = ++accountNumberGenerator;

	}

	public SavingsAccount(String name, int initialAmount) {
		this.name = name;
		this.initialAmount = initialAmount;

	}
	public static long getNextAccountNumber() {

		return accountNumberGenerator;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(int initialAmount) {
		this.initialAmount = initialAmount;
	}
	public int deposit(int amountWithdrew)
	{
		return (amountWithdrew+getInitialAmount());
		//System.out.println(amountWithdrew+getInitialAmount());
	}
	public int withdrew(int depositAmount) throws invalidException
	{
		if(depositAmount>getInitialAmount())
		{
			throw new invalidException ("withdrew is less than the initial");
		}
		else
		{
			//System.out.println(getInitialAmount()-depositAmount);
			
			return (getInitialAmount()-depositAmount);
	    }
	}
}
