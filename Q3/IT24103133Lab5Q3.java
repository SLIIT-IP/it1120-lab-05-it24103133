import java.util.Scanner;

	public class IT24103133Lab5Q3 {

		public static final int Room_Charge_Per_Day = 48000,
					Min_Days_For_Discount= 3,
					Discount_Rate_3_4_Days = 10,
					Discount_Rate_5_Or_More_Days = 20;  

	public static void main(String[] args){ 

			Scanner input = new Scanner (System.in);

	System.out.print("Enter Start Date (1-31): ");
	int startDate = input.nextInt();

	System.out.print("Enter End Date (1-31): ");
	int endDate  = input.nextInt();

		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate >31){
			System.out.println("Error: Day must be between 1 and 31 ");
			return;
			}
		if (startDate >= endDate){
			System.out.println("Error: Start Date must be less than End Date ");
			return;
			}

		int daysReserved = endDate - startDate;

		int discountRate = 0;
		if (daysReserved >= Min_Days_For_Discount){
			discountRate = daysReserved >= 5 ? Discount_Rate_5_Or_More_Days : Discount_Rate_3_4_Days;
			}

		double totalAmount = Room_Charge_Per_Day * daysReserved * (1.0 - discountRate / 100.0);

	System.out.println();
	System.out.println("Room Charge Per Day: Rs. " + Room_Charge_Per_Day + ".0/=");
	System.out.println("Number of Days Reserved: " + daysReserved);
	System.out.println("Totle Amount to be Paid: " + totalAmount);
	} 
}

	
 		