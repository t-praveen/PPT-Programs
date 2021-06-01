//Program to print the sum of the digits in a given number. //

package ppt;
import java.util.Scanner;

public class PPTProgram13 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int n = sc.nextInt();
		System.out.println("The sum of digits present in the given number are : "+sum(n));
		sc.close();
	}
	public static int sum(int n)
	{
		int rem = 0 ;
		int sum = 0 ;
		while(n != 0)
		{
			rem = n % 10 ;
			sum = sum + rem ;
			n /= 10 ;
		}
		return sum ;
	}
}