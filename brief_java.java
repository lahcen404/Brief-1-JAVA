import java.util.Scanner;

public class brief_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many operation you want to do");
        int NOp = sc.nextInt();


        for (int i = 0; i < NOp; i++) {
            System.out.println("=====================");
            System.out.println("Choose an operation:");
            System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Power\n6-Square\n0-Exit\n");
            int symbol = sc.nextInt();
            sc.nextLine();
            int a = 0, b = 0;

            if(symbol==6) {

                System.out.println("Entre  number");
                a = sc.nextInt();
            }
            else{
                System.out.println("Entre  1st number");
                 a = sc.nextInt();
                System.out.println("Entre  2nd number");
                 b = sc.nextInt();
                sc.nextLine();
            }




            switch (symbol) {
                case 1:
                    System.out.println("Addition of " + a + " + " + b + " is : " + Addition(a, b));
                    break;
                case 2:
                    System.out.println("Substraction of " + a + " - " + b + " is : " + Subtraction(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication of " + a + " * " + b + " is : " + Multiplication(a, b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Division of " + a + " / " + b + " is : " + Division(a, b));
                    } else {
                        System.out.println("Erreur !! Devision by 0 ");
                    }
                    break;
                case 5:
                    System.out.println("Power of " + a + " * " + b + " is : " + Power(a, b));
                    break;
                case 6:
                    System.out.println("Square of " + a + " is : " + Square(a));
                    break;
                case 0:
                    System.out.println("Exitting");
                    return;
                default:
                    System.out.println("Invalid symbol");
                    break;
            }
        }
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


    static int Division(int a, int b) {
        return a / b;
    }



    static double Power(double base, double expo) {
        int result = (int) Math.pow(base, expo);
        return result;
    }
    static double Square(double a) {
        if (a < 0) {
            System.out.println("Error !! Square root of a negative number");
            return -1;
        }
        return Math.sqrt(a);
    }
}
