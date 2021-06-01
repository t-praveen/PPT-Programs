//Program to convert octal to decimal//

package ppt;
import java.util.Scanner;

public class PPTProgram6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a hexadecimal number to convert it into decimal : ");
		String n = sc.nextLine();
		int x =  Integer.parseInt(n , 8);
		System.out.println(x);
		sc.close();
		

	}

}
