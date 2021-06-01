//Program to count the no.of digits in a given number. //

package ppt;
import java.util.Scanner;

public class PPTProgram12 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to count the no.of digits : ");
		long n = sc.nextLong();
		System.out.println("The number of digits present in the given number are : "+Count(n));
		sc.close();
	}
	public static int Count(long n)
	{
		int count = 0 ;
		while(n != 0)
		{
			n /= 10 ;
			++count;
		}
		return count ;
	}
}