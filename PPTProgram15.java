//Program to check palindrome or not. //

package ppt;
import java.util.Scanner;

public class PPTProgram15 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int n = sc.nextInt();
		Palindrome(n);
		sc.close();
	}
	public static void Palindrome(int n)
	{
		int copy = n ;
		int rem = 0 ;
		int rev = 0 ;
		while(n != 0)
		{
			rem = n % 10 ;
			rev = rev * 10 + rem ;
			n /= 10 ;
		}
		if(copy == rev)
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}
		 
	}
}