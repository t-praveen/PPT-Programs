//Program to print area of a circle//

package ppt;
import java.util.Scanner;

public class PPTProgram7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		float radius = sc.nextFloat();
		System.out.print("The area of the circle is : "+circle(radius));
		sc.close();	
	}
	public static float circle(float radius)
	{
		float PI = 3.14f ;
		float area = PI * radius * radius ;
		return area ;
	}

}
