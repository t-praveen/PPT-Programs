//Program to check prime or not. Print its square if prime or else print half of it . //
package ppt;
import java.util.Scanner;
//import java.math.*;

public class PPTProgram1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check prime or not : ");
		int n = sc.nextInt();
		int prime = 0 ;
		for(int i = 2 ; i <= Math.sqrt(n) ; i++)
		{
			if(n % i == 0)
			{
				prime ++ ;
				break ;
			}
		}
		if(prime == 0)
		{
			System.out.println("Yes , the number is Prime. So its Square is : "+(n * n));
		}
		else if(n % 2 == 0)
		{
			System.out.println("No , the number is Non - Prime. So its half is : "+(n / 2));
		}
		else
		{
			System.out.println("No , the number is Non - Prime. So its half is : "+((float)n / 2));
		}

	}
}