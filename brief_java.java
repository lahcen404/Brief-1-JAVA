import java.util.Scanner;

public class brief_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================CALCULATOR=====================\n");

       /* System.out.println("---   How many operations do you want to perform?  ---");
        int NOp = sc.nextInt();


        for (int i = 0; i < NOp; i++) {*/
        int symbol;
        do {
            System.out.println("=====================");
            System.out.println("Choose an operation:");
            System.out.println("=====================\n");

            System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Power\n6-Square Root\n7-Factorial\n0-Exit\n");
            symbol = sc.nextInt();
            sc.nextLine();

            double a = 0, b = 0;

            if (symbol == 7 || symbol==6) {

                System.out.println("Enter a number:");
                a = sc.nextDouble();

            } else if (symbol >= 1 && symbol <= 5) {

               double[] numbers = Numbers();
                a=numbers[0];
                b=numbers[1];

            } else if (symbol == 0) {
                System.out.println("Exiting...");
                return;
            }

            switch (symbol) {
                case 1:
                    System.out.println("==================================");
                    System.out.println("Addition of " + a + " + " + b + " is: " + String.format("%.2f", Addition(a, b)));
                    System.out.println("==================================\n");

                    break;
                case 2:
                    System.out.println("==================================");
                    System.out.println("Subtraction of " + a + " - " + b + " is: " +  String.format("%.2f", Subtraction(a, b)));
                    System.out.println("==================================\n");
                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.println("Multiplication of " + a + " * " + b + " is: " +String.format("%.2f", Multiplication(a, b)));
                    System.out.println("==================================\n");
                    break;
                case 4:
                do{
                    if (b != 0 ) {
                        System.out.println("==================================");
                        System.out.println("Division of " + a + " / " + b + " is: " +String.format("%.2f", Division(a, b)));
                        System.out.println("==================================\n");
                    } else {
                        System.out.println("==================================");
                        System.out.println("Error! Division by zero ");
                        System.out.println("==================================\n");
                        Numbers();

                    }}while(b == 0);
                    break;
                case 5:
                    System.out.println("==================================");
                    System.out.println("Power of " + a + " raised to " + b + " is: " +String.format("%.2f", Power(a, b)));
                    System.out.println("==================================\n");
                    break;
                case 6:
                    if (a >= 0) {
                        System.out.println("==================================");
                        System.out.println("Square root of " + a + " is: " + String.format("%.2f",SquareRoot(a)));
                        System.out.println("==================================\n");

                    } else {
                        System.out.println("==================================");
                        System.out.println("Error! Cannot calculate  square root of a negative number");
                        System.out.println("==================================\n");

                    }
                    break;
                case 7:
                    System.out.println("==================================");
                    System.out.println("Factorial of " + a + " is: " + Factorial((int)a));
                    System.out.println("==================================\n");

                    break;
                case 0:
                    System.out.println("==================================");
                    System.out.println("Exiting!!! , Good Bye!!");
                    System.out.println("==================================\n");
                break;
                default:
                    System.out.println("Invalid operation!!!");
                    break;
            }

        } while (symbol != 0);
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
    static double[] Numbers (){
        Scanner sc=new Scanner(System.in);
        double [] numbers =new double[2];
        System.out.println("Enter the 1st number:");
        numbers[0] = sc.nextDouble();
        System.out.println("Enter the 2nd number:");
        numbers[1] = sc.nextDouble();
        return numbers;
    }
}
