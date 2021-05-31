//Program to Covert decimal to Hexadecimal//

package ppt;
import java.util.Scanner;

public class PPTProgram3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to convert it into Hexadecimal : ");
		int n = sc.nextInt();
		String x = Integer.toHexString(n);
		System.out.println(x);
		sc.close();

	}

}
