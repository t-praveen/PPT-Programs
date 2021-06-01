//Program to calculate the power of a number//

package ppt;
import java.util.Scanner;

public class PPTProgram10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		System.out.print("Enter a number to raise to its power : ");
		int b = sc.nextInt();
		Power(a,b);
		sc.close();
	}
	public static void Power(int a , int b)
	{
		double result = Math.pow(a, b);
		System.out.println(result);
	}

}
