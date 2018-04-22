package lab8a;

public class SavingsAccountTest
{
	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new SavingsAccount();
		System.out.println("Account number: " + saver1.getAccountNumber() ) ;
		saver1.setSavingBalance(2000);
		saver1.setAnnualInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		System.out.println("Saver 1, Year 1 = " + saver1.getSavingBalance() );
		saver1.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		System.out.println("Saver 1,Year 2 = " + saver1.getSavingBalance() );
		
		SavingsAccount saver2 = new SavingsAccount();		
		System.out.println("Account number: " + saver2.getAccountNumber() ) ;
		saver2.setSavingBalance(3000);
		saver2.setAnnualInterestRate(0.04);
		saver2.calculateMonthlyInterest();
		System.out.println("Saver 2, Year 1 = " + saver2.getSavingBalance());
		saver2.modifyInterestRate(0.05);
		saver2.calculateMonthlyInterest();
		System.out.println("Saver 2,Year 2 = " + saver2.getSavingBalance() );
	}

}