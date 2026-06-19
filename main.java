import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator();

        while (true) {

            System.out.println("\n=== ROBUST SCIENTIFIC CALCULATOR ===");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Sqrt");
            System.out.println("6. Power");
            System.out.println("7. Sin");
            System.out.println("8. Cos");
            System.out.println("9. Tan");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Enter number only.");
                sc.next();
                continue;
            }

            if (choice == 0) {
                System.out.println("Calculator Closed");
                break;
            }

            try {
                double a, b;

                switch (choice) {

                    case 1:
                        System.out.print("Enter A and B: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.add(a, b));
                        break;

                    case 2:
                        System.out.print("Enter A and B: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.sub(a, b));
                        break;

                    case 3:
                        System.out.print("Enter A and B: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.mul(a, b));
                        break;

                    case 4:
                        System.out.print("Enter A and B: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.div(a, b));
                        break;

                    case 5:
                        System.out.print("Enter A: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.sqrt(a));
                        break;

                    case 6:
                        System.out.print("Enter A and B: ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println("Result: " + calc.power(a, b));
                        break;

                    case 7:
                        System.out.print("Enter angle: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.sin(a));
                        break;

                    case 8:
                        System.out.print("Enter angle: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.cos(a));
                        break;

                    case 9:
                        System.out.print("Enter angle: ");
                        a = sc.nextDouble();
                        System.out.println("Result: " + calc.tan(a));
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (ArithmeticException e) {
                System.out.println("Math Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error in input!");
                sc.nextLine();
            }
        }

        sc.close();
    }
}