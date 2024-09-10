import java.util.Scanner;

public class calc {
    public static void main(String[]args){
    

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    double num1 = scanner.nextDouble();

    System.out.println("Enter the second number: ");
    double num2 = scanner.nextDouble();

    System.out.println("Sum: " + addition(num1, num2));
    System.out.println("Difference: " + subtraction(num1, num2));
    System.out.println("Product: " + multiplication(num1, num2));
    System.out.println("Quotient: " + division(num1, num2));
    //System.out.println("Modulus: " + modulus(num1, num2));


    } 
    //Method

    public static double addition(double a, double b){
        return a + b;
    }

    public static double subtraction(double a, double b){
        return a - b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }

    public static double division(double a, double b){
        if(b==0){
            System.out.println("Cannot divide by 0");
            return 0;
        } else {
            return a/b;
        }
    }

    public static double modulus(double a, double b){
        return a % b;
    } 

}

