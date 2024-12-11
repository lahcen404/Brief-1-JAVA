import java.util.Scanner;

public class brief_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many operations do you want to perform?");
        int NOp = sc.nextInt();


        for (int i = 0; i < NOp; i++) {
            System.out.println("=====================");
            System.out.println("Choose an operation:");
            System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Power\n6-Square Root\n7-Factorial\n0-Exit\n");
            int symbol = sc.nextInt();
            sc.nextLine();

            int a = 0, b = 0;

            if (symbol == 7 || symbol==6) {

                System.out.println("Enter a number:");
                a = sc.nextInt();
            } else if (symbol >= 1 && symbol <= 5) {

                System.out.println("Enter the 1st number:");
                a = sc.nextInt();
                System.out.println("Enter the 2nd number:");
                b = sc.nextInt();
            } else if (symbol == 0) {
                System.out.println("Exiting...");
                return;
            } else {
                System.out.println("Invalid operation. Please try again.");
                continue;
            }

            switch (symbol) {
                case 1:
                    System.out.println("Addition of " + a + " + " + b + " is: " + String.format("%.2f", Addition(a, b)));
                    break;
                case 2:
                    System.out.println("Subtraction of " + a + " - " + b + " is: " +  String.format("%.2f", Subtraction(a, b)));
                    break;
                case 3:
                    System.out.println("Multiplication of " + a + " * " + b + " is: " +String.format("%.2f", Multiplication(a, b)));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Division of " + a + " / " + b + " is: " +String.format("%.2f", Division(a, b)));
                    } else {
                        System.out.println("Error! Division by zero is undefined.");
                    }
                    break;
                case 5:
                    System.out.println("Power of " + a + " raised to " + b + " is: " +String.format("%.2f", Power(a, b)));
                    break;
                case 6:
                    if (a >= 0) {
                        System.out.println("Square root of " + a + " is: " + String.format("%.2f",SquareRoot(a)));
                    } else {
                        System.out.println("Error! Cannot calculate the square root of a negative number.");
                    }
                    break;
                case 7:

                    System.out.println("Factorial of " + a + " is: " + String.format("%.2f",Factorial(a)));

                    break;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
        sc.close();
    }

    static int Addition(int a, int b) {
        return a + b;
    }

    static int Subtraction(int a, int b) {
        return a - b;
    }

    static int Multiplication(int a, int b) {
        return a * b;
    }

    static double Division(int a, int b) {
        return (double) a / b;
    }

    static double Power(double base, double expo) {
        return Math.pow(base, expo);
    }

    static double SquareRoot(double a) {
        return Math.sqrt(a);
    }

    static double Factorial (double a){
        double result=1;
        for(int i=1;i<=a;i++){
           result=result*i;
        }return result;
    }
}
