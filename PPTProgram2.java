//Program to print ASCII Value of entered character//
package ppt;
import java.util.Scanner ;

public class PPTProgram2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to display its ASCII value : ");
		char ch = sc.next().charAt(0);
		System.out.println("The ASCII value of the entered character is : "+(int)ch);
		sc.close();

	}

}
