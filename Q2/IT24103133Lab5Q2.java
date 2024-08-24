import java.util.Scanner;

	public class IT24103133Lab5Q2 {

		public static void main(String[] args){

			Scanner input = new Scanner (System.in);
	
		System.out.print("Enter the number of new members introduced: ");
		int newMember = input.nextInt();
	
	if (newMember < 0) {
            System.out.println("Input must be a 0 or greater ");
        }

	else {

	switch (newMember)
		{

		case 0:
			System.out.println();
			System.out.println("No price");
			break;
			
		case 1:
			System.out.println();
			System.out.println("Prize is a : Pen");
			break;

		case 2:
			System.out.println();
			System.out.println("Prize is a : Umbrella");
			break;

		case 3:
			System.out.println();
			System.out.println("Prize is a : Bag");
			break;

		case 4:
			System.out.println();
			System.out.println("Prize is a : Travelling Chair");
			break;

		
		default:		
			System.out.println();
			System.out.println("Prize is a : Headphone");

		}

		}	



	}
}