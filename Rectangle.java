import java.util.Scanner;
/**
 * 
 * Kevin Guo
 * Period 6 Rectangle
 */
public class Rectangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Side length of width of rectangle:\t");
		double width = in.nextDouble();
		System.out.print("Side length of height of rectangle:\t");
		double height = in.nextDouble();
		System.out.printf("Area of rectangle:\t %20.2f\n", width*height);
		System.out.printf("Perimeter of rectangle:\t %20.2f\n", 2*(width + height));
		System.out.printf("Length of diagonal:\t %20.2f", Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
		
	}

}
