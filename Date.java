import java.util.*;
/**
 * The Date class performs a multittude of operations on dates.
 * 
 * @author Vivianne Champagne
 * @version 4/11/16
 */
public class Date
{
    private int day; //declaring field
    private int month; //declaring fields
    private int year; //declaring fields

    /**
     * This default constructor sets the parts of a date to 0 to start with.
     */
    public Date()
    {
        day = 0;
        month = 0;
        year = 0;
    }
    
    /**
     * This constructor sets the fields equal to the values sent from main() in the Driver class in order to 
     * perform operations with those values.
     * 
     * @param d - an int holding the value for day
     * @param m - an int holding the value for month
     * @param y - an int holding the value for year
     */
    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    
    /**
     * This method allows the field day to be set equal to the value for day sent from main() in the Driver class.
     * 
     * @param d - an int holding the value for day
     */
    public void setDay(int d)
    {
        day = d;
    }
    
    /**
     * This method allows the field month to be set equal to the value for month sent from main() in the Driver class.
     * 
     * @param m - an int holding the value for month
     */
    public void setMonth(int m)
    {
        month = m;
    }
    
    /**
     * This method allows the field year to be set equal to the value for year sent from main() in the Driver class.
     * 
     * @param y - an int holding the value for year
     */
    public void setYear(int y)
    {
        year = y;
    }
    
    /**
     * This method allows the field day to be accessed within main() in the Driver class.
     * 
     * @return day - the int field holding the value for a day
     */
    public int getDay()
    {
        return day;
    }
    
     /**
     * This method allows the field year to be accessed within main() in the Driver class.
     * 
     * @return year - the int field holding the value for a year
     */
    public int getYear()
    {
        return year;
    }
    
    /**
     * This method calculates what day of the year the given date is, in order to make calculations in the other 
     * functions easier.
     * 
     * @return daysInYear - an int holding the value of the nth day of the year for the given date
     */
    public int daysInYear ()
    {
        int daysInYear = 0; //declaring local variables
        if(month == 1)
        { daysInYear = day; }        
        else if(month == 2)
        { daysInYear = 31 + day; } // Adds previous days of the year to day of the month     
        else if(month == 3)
        { if(year % 4 == 0)
            { daysInYear = 60 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 59 + day; }} // Adds previous days of the year to day of the month
        else if(month == 4)
        { if(year % 4 == 0)
            { daysInYear = 91 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 90 + day; }} // Adds previous days of the year to day of the month          
        else if(month == 5)
        { if(year % 4 == 0)
            { daysInYear = 121 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 120 + day; }}  // Adds previous days of the year to day of the month          
        else if(month == 6)
        { if(year % 4 == 0)
            { daysInYear = 152 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 151 + day; }} // Adds previous days of the year to day of the month          
        else if(month == 7)
        { if(year % 4 == 0)
            { daysInYear = 182 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 181 + day; }} // Adds previous days of the year to day of the month        
        else if(month == 8)
        { if(year % 4 == 0)
            { daysInYear = 213 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 212 + day; }} // Adds previous days of the year to day of the month           
        else if(month == 9)
        { if(year % 4 == 0)
            { daysInYear = 244 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 243 + day; }} // Adds previous days of the year to day of the month            
        else if(month == 10)
        { if(year % 4 == 0)
            { daysInYear = 274 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 273 + day; }} // Adds previous days of the year to day of the month            
        else if(month == 11)
        { if(year % 4 == 0)
            { daysInYear = 305 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 304 + day; }} // Adds previous days of the year to day of the month          
        else if(month == 12)
        { if(year % 4 == 0)
            { daysInYear = 335 + day; } // Adds previous days of the year to day of the month
            else if(year % 4 != 0)
            { daysInYear = 334 + day; }} // Adds previous days of the year to day of the month
            
        return daysInYear;
    }
    
    /**
     * This method converts the how many days of a year a date is to the month and the day of the month a date is.
     * 
     * @param y - an int holding the year
     * @param exD - an int holding the value for how many days of the year a date is
     * @return monthAndDay - an array holding the converted month and day in order to return both values
     */
    public int[] calculateNewDate(int y, int exD)
    {
        int newMonth = 0; // Declaring local variables
        int newDay = 0; // Declaring local variables
        if (y % 4 == 0)
        {
            if (exD >= 1 && exD <= 31)
            { newMonth = 1; newDay = exD; }
            else if (exD >= 32 && exD <= 60)
            { newMonth = 2; newDay = exD - 31; }
            else if (exD >= 61 && exD <= 91)
            { newMonth = 3; newDay = exD - 60; }
            else if (exD >= 92 && exD <= 121)
            { newMonth = 4; newDay = exD - 91; }
            else if (exD >= 122 && exD <= 152)
            { newMonth = 5; newDay = exD - 121; }
            else if (exD >= 153 && exD <= 182)
            { newMonth = 6; newDay = exD - 152; }
            else if (exD >= 183 && exD <= 213)
            { newMonth = 7; newDay = exD - 182; }
            else if (exD >= 214 && exD <= 244)
            { newMonth = 8; newDay = exD - 213; }
            else if (exD >= 245 && exD <= 274)
            { newMonth = 9; newDay = exD - 244; }
            else if (exD >= 275 && exD <= 305)
            { newMonth = 10; newDay = exD - 274; }
            else if (exD >= 306 && exD <= 335)
            { newMonth = 11; newDay = exD - 305; }
            else if (exD >= 336 && exD <= 366)
            { newMonth = 12; newDay = exD - 335; }
        }
        else if (y % 4 != 0)
        {
            if (exD >= 1 && exD <= 31)
            { newMonth = 1; newDay = exD;}
            else if (exD >= 32 && exD <= 59)
            { newMonth = 2; newDay = exD - 31; }
            else if (exD >= 60 && exD <= 90)
            { newMonth = 3; newDay = exD - 59; }
            else if (exD >= 91 && exD <= 120)
            { newMonth = 4; newDay = exD - 90; }
            else if (exD >= 121 && exD <= 151)
            { newMonth = 5; newDay = exD - 120; }
            else if (exD >= 152 && exD <= 181)
            { newMonth = 6; newDay = exD - 151; }
            else if (exD >= 182 && exD <= 212)
            { newMonth = 7; newDay = exD - 181; }
            else if (exD >= 213 && exD <= 243)
            { newMonth = 8; newDay = exD - 212; }
            else if (exD >= 244 && exD <= 273)
            { newMonth = 9; newDay = exD - 243; }
            else if (exD >= 274 && exD <= 304)
            { newMonth = 10; newDay = exD - 273; }
            else if (exD >= 305 && exD <= 334)
            { newMonth = 11; newDay = exD - 304; }
            else if (exD >= 335 && exD <= 365)
            { newMonth = 12; newDay = exD - 334; }    
        }
        
        int [] monthAndDay = new int [2]; // Declaring array
        monthAndDay[0] = newMonth; // Setting the first slot in the array as the month
        monthAndDay[1] = newDay; // Setting the second slot in the array as the day
        
        return monthAndDay;
    }
    
    /**
     * This method adds a number of days specified in main() to a date. 
     * 
     * @param  numDays - an int sent from main() in the Driver class to be added on to a date
     * @return newDate - a Date object holding the new calculated date
     */
    public Date add (int numDays)
    {
        int newMonth = 0; // Declaring local variables
        int newDay = 0; // Declaring local variables
        int newYear = 0; // Declaring local variables
        int extraDays, extraYears; // Declaring local variables
        int daysInYear = 0; // Declaring local variables
        
        int [] holderArray = new int [2]; // Declaring array
        
        daysInYear = daysInYear(); // Calls the daysInYear method
        
        if (year % 4 == 0) // If the year is a leap year
        {
            if ((daysInYear + numDays) > 366) // if 
            {  
                extraDays = daysInYear + numDays;
                int y = 0;
                while (extraDays > 365)
                {
                    if ((year + y) % 4 == 0)
                    { extraDays -= 366; }
                    else if ((year + y) % 4 != 0)
                    { extraDays -= 365; }
                    y++; 
                }
                extraYears = y;
                newYear = year + extraYears;
                                
                holderArray = calculateNewDate(newYear, extraDays);
                
                newMonth = holderArray[0];
                newDay = holderArray[1];
            }
            else if ((daysInYear + numDays) <= 366)
            {
                extraDays = daysInYear + numDays;
                newYear = year;
                
                holderArray = calculateNewDate(newYear, extraDays);
                
                newMonth = holderArray[0];
                newDay = holderArray[1];
            }
        }
        else if (year % 4 != 0) // If the year is not a leap year
        {
            if ((daysInYear + numDays) > 365)
            {
                extraDays = numDays + daysInYear;
                int y = 0;
                while (extraDays > 365)
                {
                    if ((year + y) % 4 == 0)
                    { extraDays -= 366; }
                    else if ((year + y) % 4 != 0)
                    { extraDays -= 365; }
                    y++; 
                }
                extraYears = y;
                newYear = year + extraYears;
                
                holderArray = calculateNewDate(newYear, extraDays);
                
                newMonth = holderArray[0];
                newDay = holderArray[1];
            }
            else if ((daysInYear + numDays) <= 365)
            {
                extraDays = daysInYear + numDays;
                newYear = year;
                
                holderArray = calculateNewDate(newYear, extraDays);
                
                newMonth = holderArray[0];
                newDay = holderArray[1];
            }
        }
        
        month = newMonth;
        day = newDay;
        year = newYear;
        Date newDate = new Date(day, month, year);
        
        return newDate;
    }
    
    /**
     * This method subtracts a number of days specified in main() to a date. 
     * 
     * @param  numDays - an int sent from main() in the Driver class to be added on to a date
     * @return newDate - a Date object holding the new calculated date
     */
    public Date subtract (int numDays)
    {
        int newDay = 0;  // Declaring local variables
        int newMonth = 0;  // Declaring local variables
        int newYear = 0;  // Declaring local variables
        int extraDays, extraYears;  // Declaring local variables
        int daysInYear = 0;  // Declaring local variables
        char holder = 'c';  // Declaring local variables
        
        int [] holderArray = new int [2];
        
        daysInYear = daysInYear();        

        if ((daysInYear - numDays) > 0)    
        {    
                extraDays = daysInYear - numDays;
                newYear = year;
                
                holderArray = calculateNewDate(newYear, extraDays);
                
                newMonth = holderArray[0];
                newDay = holderArray[1];
        }
        else if ((daysInYear - numDays) <= 0)
        {
                extraDays =  -1 * (daysInYear - numDays);
                int y = 0;
                if (year % 4 != 0)
                {
                    if (extraDays > 365)
                    { holder = 'a'; }
                    else if (extraDays <= 365)
                    { holder = 'b'; }
                }
                else if (year % 4 == 0)
                {
                    if (extraDays > 366)
                    { holder = 'c'; }
                    else if (extraDays <= 366)
                    { holder = 'd'; }
                }
                switch (holder)
                {
                        case 'a':   while (extraDays > 366)
                                    {
                                        if ((year - y) % 4 == 0)
                                        { extraDays -= 366; }
                                        else if ((year - y) % 4 != 0)
                                        { extraDays -= 365; }
                                        y++; 
                                    }
                                    extraYears = y;
                                    newYear = year - extraYears;
                                    break;
                        case 'b':   newYear = year - 1;                                 
                                    break;
                        case 'c':   while (extraDays > 365)
                                    {
                                        if ((year - y) % 4 == 0)
                                        { extraDays -= 366; }
                                        else if ((year - y) % 4 != 0)
                                        { extraDays -= 365; }
                                        y++; 
                                    }
                                    extraYears = y;
                                    newYear = year - extraYears;
                                    break;
                        case 'd':   newYear = year - 1;                                 
                                    break;            
                }
                if (newYear % 4 == 0)
                { extraDays = 366 - extraDays; }
                else if (newYear % 4 != 0)
                { extraDays = 365 - extraDays; }
                if (extraDays == 0)
                {
                    newMonth = month;
                    newDay = day;
                }                
                else if (extraDays != 0)
                {                
                    holderArray = calculateNewDate(newYear, extraDays);
                
                    newMonth = holderArray[0];
                    newDay = holderArray[1];
                }
        }                                                  
        
        Date newDate = new Date (newDay, newMonth, newYear);
        
        return newDate;
     }
    
     /**
      * This method calculates the number of days between two dates.
      * 
      * @param anotherDate - a Date object used as the second date when trying to find the number of days between the two dates
      * @return daysBetween - an int holding the number of days between the two dates
      */
    public int daysBetween (Date anotherDate)
    {
        int yearsBetween = 0; // Declaring local variables
        int daysBetween = 0;  // Declaring local variables
        int daysInYearsBetween = 0;  // Declaring local variables
        int daysInYear1 = 0;  // Declaring local variables
        int daysInYear2 = 0; // Declaring local variables
        
        if (this.year > anotherDate.year)
        {
            yearsBetween = this.year - anotherDate.year;
            for (int i = anotherDate.year; i < this.year; i++)
            {
                if (i % 4 == 0)
                {
                    daysInYearsBetween += 366;
                }
                else if (i % 4 != 0)
                {
                    daysInYearsBetween += 365;
                }
            }
        }
        else if (this.year < anotherDate.year)
        {
            yearsBetween = anotherDate.year - this.year;
            for (int i = this.year; i < anotherDate.year; i++)
            {
                if (i % 4 == 0)
                {
                    daysInYearsBetween += 366;
                }
                else if (i % 4 != 0)
                {
                    daysInYearsBetween += 365;
                }
            }
        }
        else if (this.year == anotherDate.year)
        {
            yearsBetween = 0;
        }
        
        daysInYear1 = this.daysInYear();
        daysInYear2 = anotherDate.daysInYear(); 
            
        if (daysInYear1 > daysInYear2)
        {
            daysBetween = (daysInYear1 - daysInYear2) + daysInYearsBetween;      
        }
        else if (daysInYear1 < daysInYear2)
        {
            daysBetween = (daysInYear2 - daysInYear1) + daysInYearsBetween;      
        }
        
        return daysBetween;
    }
    
    /**
     * This method converts the date from a numeric format to a word format.
     * 
     * @param format - a char holding a letter for the format
     * @return monthName - a String holding the name of the month
     */
    public String getDate(char format)
    {
        String monthName = " ";
        
        if (month == 1)
        { monthName = "January"; }
        else if (month == 2)
        { monthName = "February"; }
        else if (month == 3)
        { monthName = "March"; }
        else if (month == 4)
        { monthName = "April"; }
        else if (month == 5)
        { monthName = "May"; }
        else if (month == 6)
        { monthName = "June"; }
        else if (month == 7)
        { monthName = "July"; }
        else if (month == 8)
        { monthName = "August"; }
        else if (month == 9)
        { monthName = "September"; }
        else if (month == 10)
        { monthName = "October"; }
        else if (month == 11)
        { monthName = "November"; }
        else if (month == 12)
        { monthName = "December"; }
    
        return monthName;        
    }           
    
    /**
     * This toString method returns each part of a date put together as a string.
     * 
     * @return - a reference to the string that holds all the parts of a date in a numeric format
     */
    public String toString()
    {
        return month + "/" + day + "/" + year;
    }
    
    /**
     * This method determines if two dates from two Date objects are the same or not.
     * 
     * @param another - a second Date object to compare the first one to
     * @return result - a boolean holding true if the two dates are equal, or false if they are not
     */
    public boolean equals(Date another)
    {
        boolean result = false;
        if (this.day == another.day && this.month == another.month && this.year == another.year)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        
        return result;
    }
    
    /**
     * This method determines the order in which two dates from two Date objects take place.
     * 
     * @param another - a second Date object to compare the first one to
     * @return result - an int holding a value associated with a result of the comparison
     */
    public int compareTo(Date another)
    {
        int result = 0;
        if (this.year > another.year)
        {
            result = 1;            
        }
        else if (this.year < another.year)
        {
            result = -1;
        }
        else if (this.year == another.year)
        {
            if (this.month > another.month)
            {
                result = 2;
            }
            else if (this.month < another.month)
            {
                result = -2;
            }
            else if (this.month == another.month)
            {
                if (this.day > another.day)
                {
                    result = 3;
                }
                else if (this.day < another.day)
                {
                    result = -3;
                }
                else if (this.day == another.day)
                {
                    result = 0;
                }
            }
        }
        
        return result;
    }
    
    /**
     * This method calculates the number of hours between two dates.
     * 
     * @param anotherDate - a Date object used as the second date
     * @return hours - an int holding the number of hours between the two dates 
     */
    public int numberOfHours(Date anotherDate)
    {
        int hours = 0;
        
        hours = this.daysBetween(anotherDate) * 24;
        
        return hours;
    }
    
    /**
     * This method calculates the number of minutes between two dates.
     * 
     * @param anotherDate - a Date object used as the second date
     * @return minutes - an int holding the number of minutes between the two dates
     */
    public int numberOfMinutes(Date anotherDate)
    {
        int minutes = 0;
        
        minutes = this.daysBetween(anotherDate) * 24 * 60;
        
        return minutes;
    }
    
    /**
     * This method calculates the number of seconds between two dates.
     * 
     * @param anotherDate - a Date object used as the second date
     * @return seconds - an int holding the number of seconds between the two dates
     */
    public int numberOfSeconds(Date anotherDate)
    {
        int seconds = 0;
        
        seconds = this.daysBetween(anotherDate) * 24 * 60 * 60;
        
        return seconds;
    }
    
    /**
     * This method determines the number of leap years that pass between two dates.
     * 
     * @param anotherDate - a Date object used as the second date
     * @return leapYears - an int holding the number of leap years between the two dates
     */
    public int numberOfLeapYears(Date anotherDate)
    {
        int leapYears = 0;
        
        if (this.year > anotherDate.year)
        {            
            for (int i = anotherDate.year; i <= this.year; i++)
            {
                if (i % 4 == 0)
                {
                    leapYears++;
                }
            }
        }
        else if (this.year < anotherDate.year)
        {
            for (int i = this.year; i <= anotherDate.year; i++)
            {
                if (i % 4 == 0)
                {
                    leapYears++;
                }
            }
        }
        else if (this.year == anotherDate.year)
        {
            leapYears = 0;
        }
        
        return leapYears;
    }
}
