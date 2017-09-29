package example17;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display show how to compute a paycheck
*/
public class Example17 
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
		//Declare variables
		double regularPay;
		double overTimePay;
		double totalPay;
		
		//ask the user to enter their hourly wage
		System.out.print("What is your hourly wage: ");
		double hourlyWage = in.nextDouble();
        
		//ask the user to enter their number of hours they worked in the past week
		System.out.print("How many hours did you work this week? ");
		double hourWork = in.nextDouble();
		
		System.out.println("");
		
		//Show the hourly wage and hours worked
		System.out.println("Hourly Wage: " + " $" + hourlyWage);
		System.out.println("Hours Worked: " + hourWork);
		
		//calculation
		regularPay = hourlyWage * 40;
		overTimePay = (hourlyWage * 1.5) * (hourWork - 40);
		totalPay = regularPay + overTimePay;
		
		System.out.println("");
		
		//Display regular pay
        System.out.println("Regular Pay:\t" + "$" + regularPay);
		
		//Display Overtime pay
        System.out.println("Overtime Pay:\t" + "$" + overTimePay);
		
		//Display Total pay
        System.out.println("Total Pay: \t" + "$" + totalPay);
	} 
}
