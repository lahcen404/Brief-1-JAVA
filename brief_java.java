import java.util.Scanner;

public class brief_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many operation you want to do");
        int NOp = sc.nextInt();




        for (int i = 0; i < NOp; i++) {


            System.out.println("How many numbers you want to calcul");
            int NbrCal = sc.nextInt();
            System.out.println("Choose an operation:");
            System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
            int symbol = sc.nextInt();
            sc.nextLine();

            double[] numbers = new double[NbrCal];

            System.out.println("Entre the Numbers !!");
            for(i=0 ;i<NbrCal;i++){
                numbers[i]= sc.nextDouble();

            }
            sc.nextLine();




            switch (symbol) {
                case 1:
                    System.out.println("Addition is " + Addition(numbers));
                    break;
              case 2:
                    System.out.println(" Substraction is " + Subtraction(numbers));
                    break;
                 case 3:
                    System.out.println(" Multiplication of numbers  is " + Multiplication(numbers));
                    break;

                case 4:
                    if (numbers[0] != 0) {
                        System.out.println(" Division of numbers is  " + Division(numbers));
                    } else {
                        System.out.println("Erreur !! Devision par 0 ");
                    }
                    break;
                    /*
                case "%":
                    if (b != 0) {
                        System.out.println("Reste de " + a + " / " + b + " est : " + Modulo(a, b));
                    } else {
                        System.out.println("Erreur !! Devision par 0 ");
                    }
                    break;
                case "^":
                    System.out.println("Power of " + a + " ^ " + b + " is :" + Power(a, b));
                    break;
                case "square":
                    System.out.println("square of " + a + " is :" + Racine(a));
                    break;
*/
                default:
                    System.out.println("Invalid symbol");
                    break;
            }

        }
    }

    static double Addition(double []numbers) {
double result=0;
   for(double num : numbers){
       result=result+num;
   }
        return result;
    }

    static double Subtraction(double []numbers) {
        double result = numbers[0]; // start with first nnumber
        for (int i = 1; i < numbers.length; i++) {
            result = result -numbers[i];
        }
        return result;

    }

    static double Multiplication(double []numbers) {
    double result=1;
    for(double num : numbers){
        result=result*num;
    }
        return result;
    }

    static double Division(double []numbers) {

        double result =0;
        for(double num : numbers){
            result=result/num;
        }

        return result;
    }
/*
    static double Modulo(double []numbers) {
        return a % b;
    }

    static double Power(double []numbers) {
        int result = (int) Math.pow(base, expo);
        return result;
    }

    static double Racine(double []numbers) {
        if (a < 0) {
            System.out.println("Error !! Square root of a negative number");
            return -1;
        }
        return Math.sqrt(a);
    }
*/



}