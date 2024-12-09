import java.util.Scanner;

public class brief_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre  1st number");
        int a = sc.nextInt();

        System.out.println("Entre  2nd number");
        int b = sc.nextInt();

        System.out.println("Entre symbol");
        String symbol = sc.nextLine();
        


    }
        int Addition (int a, int b) {
            return a + b;
    }
    int Subtraction (int a, int b) {
        return a - b;
    }
    int Multiplication (int a, int b) {
        return a * b;
    }
    int Division (int a, int b) {
        return a / b;
    }
    int Modulo (int a, int b) {
        return a % b;
    }
    
    
}