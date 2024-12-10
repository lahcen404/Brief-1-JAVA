import java.util.Scanner;

public class brief_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("How many operation you want to do");
int NOp= sc.nextInt();

        for (int i=0;i<NOp;i++) {

            System.out.println("Entre  1st number");
            int a = sc.nextInt();

            System.out.println("Entre  2nd number");
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println("Entre symbol  (+ | - | * | / | %)");
            String symbol = sc.nextLine();

            switch (symbol) {
                case "+":
                    System.out.println("L'addition de " + a + " + " + b + " est : " + Addition(a, b));
                    break;
                case "-":
                    System.out.println("La Substraction de " + a + " - " + b + " est : " + Subtraction(a, b));
                    break;
                case "*":
                    System.out.println("La Multiplication de " + a + " * " + b + " est : " + Multiplication(a, b));
                    break;
                case "/":
                    if (b!=0) {
                        System.out.println("La Division de " + a + " / " + b + " est : " + Division(a, b));
                    }
                    else {
                        System.out.println("Erreur !! Devision par 0 ");
                    }
                    break;
                case "%":
                    if (b!=0) {
                        System.out.println("Reste de " + a + " / " + b + " est : " + Modulo(a, b));
                    }
                    else {
                        System.out.println("Erreur !! Devision par 0 ");
                    }
                    break;
                default:
                    System.out.println("Invalid symbol");
                    break;
            }

        }
                    }
      static int Addition (int a, int b) {

        return a + b;
    }
    static int Subtraction (int a, int b) {

        return a - b;
    }
    static int Multiplication (int a, int b) {

        return a * b;
    }
    static int Division (int a, int b) {
        return a / b;
    }
    static int Modulo (int a, int b) {
        return a % b;
    }
    
    
}