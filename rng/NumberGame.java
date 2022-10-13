
/**
 * Write a description of class rng here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        int mysteryNumber = 5;
        int mysteryNumber = r.nextInt(100) + 1;
  
        System.out.println("What mode would you like to play ?\nEasy\nMedium\nHard");
        String mode = s.nextLine();
        
        
        int maximum;
        if (mode.equals("Easy")) {
            maximum = 10;
        }
        else if (mode.equals("Medium")) {
            maximum = 50;
        }
        else {
            maximum = 100;
        }
        System.out.print("Enter your guess: ");
        
       
