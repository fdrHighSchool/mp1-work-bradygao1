
/**
 * Think Java; Chapter 2
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.Scanner;

public class Date
{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  
    
    System.out.println("What day of the week is it : ");
    String weekDay = s.nextLine();
    
    System.out.println("What month is it : ");
    String month = s.nextLine();
    
    System.out.println("What year is it :");
    String year = s.nextLine();
    
    System.out.println("What is the day of the month :");
    String date = s.nextLine();
    
    System.out.println("American formate: The date is " +weekDay+" , "+month+" , "+date+" , "+year+"");
    System.out.println("European formate: The date is " +weekDay+" , "+date+" , "+month+" , "+year+"");
    } // end of main method
} // end of class
