//Program to check Vowel or Consonant//

package ppt;
import java.util.Scanner;

public class PPTProgram9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to check Vowel or Consonant : ");
		char c = sc.next().charAt(0);
		VC(c);
		sc.close();
	}
	public static void VC(char c)
	{
		if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
		{
			System.out.println(c+" , Entered character is a Vowel .");
		}
		else
		{
			System.out.println(c+" , Entered character is a Consonant .");;
		}
	}

}
