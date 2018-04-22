import java.util.Scanner;
/*Date: 21/02/2017
 * Purpose: to practice gui and original programming together
 * Name and st no.: Mark McCleane c00191900
 */
public class LoanDriverProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = sc.nextDouble();
		System.out.print("\nNumber of Years: ");
		int numberOfYears = sc.nextInt();
		System.out.print("Loan Amount: ");
		double loanAmount = sc.nextDouble();
		
		Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
		System.out.println("Monthly payment: " + loan.getMonthlyPayment()
		+ "\nTotalPayment: " + loan.getTotalPayment());
		
	}

}
