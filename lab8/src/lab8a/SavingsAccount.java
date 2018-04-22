package lab8a;
//Student: Mark McCleane
//Student No: C00191900
//Purpose: To build a savings account :) 

public class SavingsAccount 
{
	public static int accountNumber;
	public static double annualInterestRate;
	private double savingBalance;
	private double monthlyInterest;
	private static double anIntRate;
	
	public SavingsAccount()
	{
		accountNumber++;
		setAnnualInterestRate(0);
		setSavingBalance(0);
		modifyInterestRate(0);
	}
/*	public void finalize()
	{
		accountNumber--;
	}*/
	public void setAnnualInterestRate(double anIntRate)
	{
		annualInterestRate = anIntRate;
	}
	public void setSavingBalance(double savingBalance )
	{
		this.savingBalance = savingBalance;	
	}
	public void calculateMonthlyInterest()
	{
		monthlyInterest = (savingBalance * annualInterestRate) / 12;
		savingBalance = savingBalance + monthlyInterest;
	}
	public void modifyInterestRate(double newInterestRate)
	{
		annualInterestRate = newInterestRate; 
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate ;
	}
	public double getSavingBalance()
	{
		return savingBalance;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
}
