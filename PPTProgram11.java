//Program to print all the factors of a given number. //

package ppt;
import java.util.Scanner;

public class PPTProgram11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to display all its factors : ");
		int n = sc.nextInt();
		Factor(n);
		sc.close();
	}
	public static void Factor(int n)
	{
		System.out.println("The factors of the given number are :");
		for(int i = 1 ; i <= n ; i++)
		{
			if(n % i == 0)
			{
				System.out.println(i);
			}
		}
	}

}
