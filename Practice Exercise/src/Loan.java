/*Date: 21/02/2017
 * Purpose: to practice gui and original programming together
 * Name and st no.: Mark McCleane c00191900
 */


public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	public Loan()
	{
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
	}
	public Loan(double annualInterestRate,int numberOfYears,double loanAmount ){
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
		  / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	public double getTotalPayment(){
		double ans = getMonthlyPayment() * numberOfYears * 12;
		return ans;
	}
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(java.util.Date loanDate) {
		this.loanDate = loanDate;
	}

}