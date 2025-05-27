 import java.util.Scanner;

class Calc {

    void menu() {
        System.out.println("\nCalculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Subtraction");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Area of a Circle");
        System.out.println("7. Area of a Rectangle");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    void addition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 + num2));
    }

    void multiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 * num2));
    }

    void subtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Result: " + (num1 - num2));
    }

    void division(Scanner scanner) {
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Error! Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + (dividend / divisor));
        }
    }

    void modulus(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error! Modulus by zero is not allowed.");
        } else {
            System.out.println("Result: " + (num1 % num2));
        }
    }

    void circleArea(Scanner scanner) {
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    void rectangleArea(Scanner scanner) {
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Area: " + (length * width));
    }
     void exit(Scanner scanner){
        System.out.println("thank you for coming go");
        String input =scanner.nextLine().trim().toLowerCase();
        System.exit(0);
     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc(); // Create object of Calc
        int choice;

        do {
            calc.menu(); // Show menu
            choice = scanner.nextInt(); // Get user choice

            switch (choice) {
                case 1:
                    calc.addition(scanner);
                    break;
                case 2:
                    calc.multiplication(scanner);
                    break;
                case 3:
                    calc.subtraction(scanner);
                    break;
                case 4:
                    calc.division(scanner);
                    break;
                case 5:
                    calc.modulus(scanner);
                    break;
                case 6:
                    calc.circleArea(scanner);
                    break;
                case 7:
                    calc.rectangleArea(scanner);
                    break;
               case 8:
                    calc.exit(scanner);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 8);

        scanner.close();
    }
}
/*
import javax.swing.JOptionPane;
        class firstDialog{
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, "first java Dialog");
    }
         }

 class UseArgument{
     public static void main(String args[]){
         System.out.print("hi,");
         System.out.print(args[0]);
         System.out.println(". how are you");
     }
 }

  */