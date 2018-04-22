package test;
import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		x = sc.nextInt();
		System.out.println("Enter number");
		n = sc.nextInt();		
		
		System.out.println("power (" + x + "," + n + ") = " + power(x,n) );
		
	}
public static int power(int x,int n)
{
	int powerN = 1;
	for(int i = 1; i <= n;i++)
	{
		powerN = powerN * x;
	}
	return powerN;
}

}