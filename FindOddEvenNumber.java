package practice11;

import java.util.Scanner;

public class FindOddEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int inputNumber = sc.nextInt();
		findNumber(inputNumber);
	}

	public static void findNumber(int Number) {
	
	if(Number%2!=0)
	{
		System.out.println("Number is odd");
	}else
	{
		System.out.println("Number is even");
	}
}}

/*public class FindOddEvenNumber {
public static void main(String args[])
{
int x;
System.out.println("Enter an integer to check if it is odd or even ");
Scanner in = new Scanner(System.in);
x = in.nextInt();
if ( x % 2 == 0 )
System.out.println("You entered an even number.");
else
System.out.println("You entered an odd number.");
}
}*/
