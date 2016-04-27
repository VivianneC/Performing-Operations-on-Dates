/**
 * The Driver class contains main() and creates instances of the Date class as well as calls the methods of the Date class
 * that perform the operations on the instances.
 * 
 * @author Vivianne Champagne 
 * @version 4/11/16
 */
public class Driver
{
    public static void main(String [] args)
    {        
        System.out.println("Hello! \n\nThe purpose of this class is to test operations performed on a series of " +
                            "dates, accounting for leap years."); 
                            
        System.out.print("\n\nThe first date we will test is 8/6/2005. We will add 50 days to the date.");
        Date d1 = new Date(6, 8, 2005); // Creates a new instance of the Date class with specified valuessent into the parameters       
        System.out.println("\nThe new date is: " + d1.add(50).toString()); // Displays the new date by calling the toString method
        
        System.out.print("\nThe second date we will test is 10/22/2045, and we will add 1025 days to it.");
        d1.setDay(22); // Calls the set method for day to change the value of day
        d1.setMonth(10); // Calls the set method for month to change the value of month
        d1.setYear(2045); // Calls the set method for year to change the value of year
        System.out.println("\nThe new date is: " + d1.add(1025).toString()); // Displays the new date by calling the toString method
        
        System.out.print("\nNow we will subtract 460 days from the date 5/4/1990.");
        d1.setDay(4); // Calls the set method for day to change the value of day
        d1.setMonth(5); // Calls the set method for month to change the value of month
        d1.setYear(1990); // Calls the set method for year to change the value of year
        System.out.println("\nThe new date is: " + d1.subtract(460).toString()); // Displays the new date by calling the toString method
        
        System.out.print("\nAnd following that we will subtract 238 days from the date 10/13/2020.");
        d1.setDay(13); // Calls the set method for day to change the value of day
        d1.setMonth(10); // Calls the set method for month to change the value of month
        d1.setYear(2020); // Calls the set method for year to change the value of year
        System.out.println("\nThe new date is: " + d1.subtract(238).toString()); // Displays the new date by calling the toString method
                
        System.out.print("\nNext we will determine if the date 7/16/1995 is the same as 7/23/1995.");
        d1.setDay(16); // Calls the set method for day to change the value of day
        d1.setMonth(7); // Calls the set method for month to change the value of month
        d1.setYear(1995); // Calls the set method for year to change the value of year
        Date d2 = new Date(23, 7, 1995); // Creates a new instance of the Date class with specified valuessent into the parameters
        if (d1.equals(d2)) // Calls the equals method within the if-statement
        {
            System.out.print("\nThe dates are the same."); // Output if the equals method returns true
        }
        else
        {
            System.out.print("\nThe dates are not the same"); // Output if the equals method returns false
        }
        
        System.out.print("\n\nNow we will determine if the date 2/16/2003 is the same as 2/16/2003.");
        d1.setDay(16); // Calls the set method for day to change the value of day
        d1.setMonth(2); // Calls the set method for month to change the value of month
        d1.setYear(2003); // Calls the set method for year to change the value of year
        d2.setDay(16); // Calls the set method for day to change the value of day
        d2.setMonth(2); // Calls the set method for month to change the value of month
        d2.setYear(2003); // Calls the set method for year to change the value of year
        if (d1.equals(d2)) // Calls the equals method within the if-statement
        {
            System.out.print("\nThe dates are the same."); // Output if the equals method returns true
        }
        else // Calls the equals method within the if-statement
        {
            System.out.print("\nThe dates are not the same."); // Output if the equals method returns false
        }
        
        System.out.print("\n\nFollowing that we will determine in which order the dates 6/30/1975 and 9/5/1975 occur.");
        d1.setDay(30); // Calls the set method for day to change the value of day
        d1.setMonth(6); // Calls the set method for month to change the value of month
        d1.setYear(1975); // Calls the set method for year to change the value of year
        d2.setDay(5); // Calls the set method for day to change the value of day
        d2.setMonth(9); // Calls the set method for month to change the value of month
        d2.setYear(1975); // Calls the set method for year to change the value of year
        if (d1.compareTo(d2) > 0) // Calls the compareTo method within the if-statement
        {
            System.out.print("\n6/30/1975 takes places after 9/5/1975."); // Output if the compareTo method returns a positive value of 1, 2, or 3
        }
        else if(d1.compareTo(d2) < 0) // Calls the compareTo method within the if-statement
        {
            System.out.print("\n9/5/1975 takes place after 6/30/1975."); // Output if the compareTo method returns a negative value of -1, -2, or -3
        }
        else // Calls the compareTo method within the if-statement
        {
            System.out.print("\n9/5/1975 is the same date as 6/30/1975."); // Output if the compareTo method returns a value of 0
        }
        
        System.out.print("\n\nAnd next we will determine how many days are between the dates 9/23/2000 and 11/04/2006.");
        d1.setDay(23); // Calls the set method for day to change the value of day
        d1.setMonth(9); // Calls the set method for month to change the value of month
        d1.setYear(2000); // Calls the set method for year to change the value of year
        d2.setDay(4); // Calls the set method for day to change the value of day
        d2.setMonth(11); // Calls the set method for month to change the value of month
        d2.setYear(2006); // Calls the set method for year to change the value of year
        System.out.println("\nThere are " + d1.daysBetween(d2) + " days between the two dates."); // Displays the number of days by calling the daysBetween method
        
        System.out.print("\nNow we will change the format of the date 4/30/2010.");
        d1.setDay(30); // Calls the set method for day to change the value of day
        d1.setMonth(4); // Calls the set method for month to change the value of month
        d1.setYear(2010); // Calls the set method for year to change the value of year
        System.out.println("\nThe date is " + d1.getDate('a') + " " + d1.getDay() + ", " + d1.getYear()  + "."); // Displays the new format by calling the getDate, getDay, and getYear methods
        
        System.out.print("\nLet's find out the number of hours, minutes, and seconds between the dates 3/26/1994 and 6/2/2002.");
        d1.setDay(26); // Calls the set method for day to change the value of day
        d1.setMonth(3); // Calls the set method for month to change the value of month
        d1.setYear(1994); // Calls the set method for year to change the value of year
        d2.setDay(2); // Calls the set method for day to change the value of day
        d2.setMonth(6); // Calls the set method for month to change the value of month
        d2.setYear(2002); // Calls the set method for year to change the value of year
        System.out.println("\nHours: " + d1.numberOfHours(d2) + " Minutes: " + d1.numberOfMinutes(d2) + " Seconds: " + d1.numberOfSeconds(d2)); // Displays the nummber of seconds, minutes, and hours by calling the appropriate methods
        
        System.out.print("\nAnd lastly, we will determine how many leap years there are between the dates 1/4/1952 and 12/18/2014.");
        d1.setDay(4); // Calls the set method for day to change the value of day
        d1.setMonth(1); // Calls the set method for month to change the value of month
        d1.setYear(1952); // Calls the set method for year to change the value of year
        d2.setDay(18); // Calls the set method for day to change the value of day
        d2.setMonth(12); // Calls the set method for month to change the value of month
        d2.setYear(2014); // Calls the set method for year to change the value of year
        System.out.println("\nThere are " + d1.numberOfLeapYears(d2) + " leap years between the two dates."); // Displays the number of leapYears by calling the numberOfLeapYears method
        
        System.out.print("\n\nGoodbye!");
        
    }
}
