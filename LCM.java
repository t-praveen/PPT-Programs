//Program to print LCM of 2 numbers . //

package Recursion;
import java.util.Scanner;

public class LCM {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int n2 = sc.nextInt();
		LLCCMM(n1 , n2);
		sc.close();
	}
	public static int LLCCMM(int n1 , int n2)
	{
		int lcm ;
		lcm = (n1 > n2) ? n1 : n2 ;
		while(true)
		{
			if(lcm % n1 == 0 && lcm % n2 == 0)
			{
				System.out.println("The LCM of "+n1+" and "+n2+" is : "+lcm);
				break ;
			}
			++lcm ;
		}
		return lcm ;
	}
}	
	
	
	
