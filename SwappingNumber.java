package practice11;

import java.util.Scanner;

//swap two numbers without using third variable

/*public class SwappingNumber {

	public static void main(String[] args) {
		int a=2000;
		int b=1500;
		System.out.println("Before swapping: " + " a is " + a + " and " + "b is "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: " + " a is " + a + " and " + "b is "+ b);
	}
}*/

//swap using third variable

public class SwappingNumber {
	public static void main(String[] args) {
		int x, y, temp;
		 System.out.println("Enter x and y");
		 Scanner in = new Scanner(System.in);
		 x = in.nextInt();
		 y = in.nextInt();
		 System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
		 temp = x;
		 x = y;
		 y = temp;
		 System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	}
	}