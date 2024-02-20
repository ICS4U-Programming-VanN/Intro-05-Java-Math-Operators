import java.util.*;

/**
 * Displays Hello World message
 *
 * @author Van
 * @version 1.0
 * @since 2024/02/09
 */
public class MathOperators {
  // Initializes Variables
  private static double FirstNum, SecondNum, Calculation;

  public static void main(String[] args) {
    while (true) {
      // Displays message
      System.out.println("What operator do you want to use (+, -, *, /, ^, sqrt): ");
      // Gets user input
      Scanner sc = new Scanner(System.in);
      String Operator = sc.nextLine();

      // Determines what operator they want to use
      if (Operator != "+"
          || Operator != "-"
          || Operator != "*"
          || Operator != "/"
          || Operator != "^"
          || Operator != "sqrt") {
        System.out.println("INVALID OPERATOR!");
        break;
      }

      try {
        // First number
        System.out.println("Enter your first number: ");
        FirstNum = sc.nextDouble();

        // Second number
        System.out.println("Enter your second number: ");
        SecondNum = sc.nextDouble();
        // Error case
      } catch (Exception e) {
        System.out.println("Error" + e.getMessage());
        break;
      }
      // Calculates number and displays
      switch (Operator) {
        case "+":
          Calculation = FirstNum + SecondNum;
          System.out.println(Calculation);
          break;
        case "-":
          Calculation = FirstNum - SecondNum;
          System.out.println(Calculation);
          break;
        case "*":
          Calculation = FirstNum * SecondNum;
          System.out.println(Calculation);
          break;
        case "/":
          Calculation = FirstNum / SecondNum;
          System.out.println(Calculation);
          break;
        case "^":
          Calculation = Math.pow(FirstNum, SecondNum);
          System.out.println(FirstNum + "^" + SecondNum + " = " + Calculation);
          break;
        case "sqrt":
          FirstNum = Math.sqrt(FirstNum);
          SecondNum = Math.sqrt(SecondNum);
          System.out.println("The square root of the first number :" + FirstNum);
          System.out.println("The square root of the second number :" + SecondNum);
          break;
        default:
          break;
      }
      break;
    }
  }
}
