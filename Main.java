import java.util.Scanner;

/**
 * a program to determine which positive integer the user types
 * @author Daniel Rahmani 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // get the integer from the user
    System.out.println("Please enter a positive integer. (1-10)");
    int userNumber = input.nextInt();

    switch (userNumber) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      case 3:
        System.out.println("Three");
        break;
      case 4:
        System.out.println("Four");
        break;
      case 5:
        System.out.println("Five");
        break;
      case 6:
        System.out.println("Six");
        break;
      case 7:
        System.out.println("Seven");
        break;
      case 8:
        System.out.println("Eight");
        break;
      case 9:
        System.out.println("Nine");
        break;
      case 10:
        System.out.println("Ten");
        break;
      default:
        System.out.println("Not in the range");
    }
    
  }
}
