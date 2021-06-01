//Program to Covert decimal to octal//

package ppt;
import java.util.Scanner;

public class PPTProgram5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number to convert it into Octal : ");
		int n = sc.nextInt();
		String x = Integer.toOctalString(n);
		System.out.println(x);
		sc.close();
	}

}
