package labz13e;
/*Date: 21/02/2017
 * Purpose: to practice GUI and original programming together
 * Name and Student no.: Mark McCleane c00191900
 */
	
public class Calculator {
	private double num1;
	private double num2;
	private double answer = 0;
	private String answerType;
	
	public Calculator()
	{
		setNum1(num1);
		setNum2(num2);
	}
	public Calculator(double num1,double num2){
		setNum1(num1);
		setNum2(num2);
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getAnswer(String answerType) {	//if multiplication you * num1 by num2 etc.
	if(answerType.equals("*")){
				answer = num1 * num2;
		}
		else if(answerType.equals("+")){
			answer = num1 + num2;
		}
		else if(answerType.equals("/")){
			answer= num1 / num2;
		}
		else if(answerType.equals("-")){
			answer = num1 - num2;
		}
		return answer;
	}
}