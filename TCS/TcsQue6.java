package TCS;

/*
Given a time in 12-hour AM/PM format , convert it to 24-hour(military) format.
Note 
	1) 12:00:00 AM becomes 00:00:00
	2) 12:00:00 PM remains 12:00:00
*/
import java.util.Scanner;
public class TcsQue6{
	public static String timeConversion(String time){
		// Extract AM or PM
        	String period = time.substring(8);

        	// Extract hour
        	int hour = Integer.parseInt(time.substring(0, 2));

        	// Extract minutes and seconds
        	String rest = time.substring(2, 8);

        	if (period.equals("AM")) {

            		if (hour == 12) {
                		hour = 0;
            		}
        	} else { // PM
            		if (hour != 12) {
                		hour = hour + 12;
            		}
        	}
        	return String.format("%02d", hour) + rest;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time : ");
		String time = sc.nextLine();
		System.out.println(timeConversion(time));
	}
}
