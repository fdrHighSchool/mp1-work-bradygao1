
/**
 * Write a description of class lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Im ur book check up robot ");
        System.out.println("Im here to make sure u have done enough reading today.");
        
        System.out.print("How many books did you read : ");
        int num = input.nextInt();
        
        if (num < 5) {
            System.out.println("Damn look like u can keep up u stupit go back to reading!");
        } // end if statement
        else {
            System.out.println("Good job you can go do your thing now or you can read more.");
        } // end else statement
        
    } // end main method

} // end class

