//Program to print the reverse a given number. //

package ppt;
import java.util.Scanner;

public class PPTProgram14 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int n = sc.nextInt();
		System.out.println("The reverse of the given number is : "+reverse(n));
		sc.close();
	}
	public static int reverse(int n)
	{
		int rem = 0 ;
		int rev = 0 ;
		while(n != 0)
		{
			rem = n % 10 ;
			rev = rev * 10 + rem ;
			n /= 10 ;
		}
		return rev ;
	}
}