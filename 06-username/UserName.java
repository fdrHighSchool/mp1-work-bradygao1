import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Are you a teacher or a student: ");
    String user = s.nextLine();
    System.out.println("Whats your favorite number: ");
    String num = s.nextLine();
    // test output
    System.out.println((firstName) + initialize(lastName));
    
    
    if(user == ("teacher")) {
        System.out.println((firstName) + initialize(lastName) + (num) + ("@schools.nyc.gov"));
    }
    else {
        System.out.println((firstName) + initialize(lastName) + (num) + ("@nycstudents.net"));
    }

    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
