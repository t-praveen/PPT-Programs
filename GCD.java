//Program to print GCD of 2 numbers . //

package Recursion;
import java.util.Scanner;

public class GCD {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int n2 = sc.nextInt();
		System.out.println("The GCD of "+n1+" and "+n2+" is : "+GGCCDD(n1 , n2));
		sc.close();
	}
	public static int GGCCDD(int n1 , int n2)
	{
		int gcd = 1 ;
		for(int i = 1 ; i <= n1 && i <= n2 ; i++)
		{
			if(n1 % i == 0 && n2 % i == 0)
			{
				gcd = i ;
			}
		}
		return gcd ;
	}
}	

	
	
	/*     OR
	 *	while(n1 != n2)
	 *	{
	 *		if(n1 > n2)
	 *		{
	 *			n1 -= n2 ;
	 *		}
	 *		else
	 *		{
	 *			n2 -= n1 ;
	 *		}
	 *}
	 *System.out.println(n1); 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */


