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

            double a = 0, b = 0;

            if (symbol == 7 || symbol==6) {

                System.out.println("Enter a number:");
                a = sc.nextDouble();
            } else if (symbol >= 1 && symbol <= 5) {

                System.out.println("Enter the 1st number:");
                a = sc.nextDouble();
                System.out.println("Enter the 2nd number:");
                b = sc.nextDouble();
            } else if (symbol == 0) {
                System.out.println("Exiting...");
                return;
            } else {
                System.out.println("Invalid operation !!!");
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
                        System.out.println("Error! Division by zero ");
                    }
                    break;
                case 5:
                    System.out.println("Power of " + a + " raised to " + b + " is: " +String.format("%.2f", Power(a, b)));
                    break;
                case 6:
                    if (a >= 0) {
                        System.out.println("Square root of " + a + " is: " + String.format("%.2f",SquareRoot(a)));
                    } else {
                        System.out.println("Error! Cannot calculate  square root of a negative number");
                    }
                    break;
                case 7:

                    System.out.println("Factorial of " + a + " is: " + Factorial((int)a));

                    break;
                case 0:
                    System.out.println("Exiting!!!");
                default:
                    System.out.println("Invalid operation!!!");
                    break;
            }
        }
        sc.close();
    }

    static double Addition(double a, double b) {
        return a + b;
    }

    static double Subtraction(double a, double b) {
        return a - b;
    }

    static double Multiplication(double a, double b) {
        return a * b;
    }

    static double Division(double a, double b) {
        return  a / b;
    }

    static double Power(double base, double expo) {
        return Math.pow(base, expo);
    }

    static double SquareRoot(double a) {
        return Math.sqrt(a);
    }

    static int Factorial (int a){
        int result=1;
        for(int i=1;i<=a;i++){
           result=result*i;
        }return result;
    }
}
