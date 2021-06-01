//Program to check alphabet or not//

package ppt;
import java.util.Scanner;

public class PPTProgram8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to check wether it is alphabet or not : ");
		char c = sc.next().charAt(0);
		Alpha(c);
		sc.close();
	}
	public static void Alpha(char c)
	{
		if(c >= 'A' && c <= 'Z' || c >='a' && c <= 'z')
		{
			System.out.println(c+" , Entered character is Alphabet.");
		}
		else
		{
			System.out.println(c+" , Entered character is not a Alphabet.");
		}
	}

}
