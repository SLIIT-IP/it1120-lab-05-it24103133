import java.util.Scanner;

	public class IT24103133Lab5Q1 {

		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int number1,number2,number3,smallest,largest;
		
		System.out.print("Enter the first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter the second integer: ");
		number2 = input.nextInt();

		System.out.print("Enter the third integer: ");
		number3 = input.nextInt();

	smallest=number1;
	largest=number1;

		if (number1<number2)
			largest = number2;
		if (number2<number3)
			largest = number3;
		if (number1>number2)
			smallest = number2;
		if (number2>number3)
			smallest = number3;

	System.out.println();
	System.out.println("User enterd numbers are : " +number1+" "+number2+" "+number3);
	System.out.println("The smallest number is : " +smallest);
	System.out.println("The largest number is : " +largest);

	}
}