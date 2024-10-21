import java.util.Scanner;

public class BasicCalaculator {

    public static void main(String[] args){
    
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        int addition = num1 +num2;
        int Subtraction = num1-num2;
        int Multiplication= num1*num2;
        int Division= num1/num2;

        System.out.println("Addition: "+addition);
        System.out.println("Subtraction: "+ Subtraction);
        System.out.println("Multiplication: "+Multiplication);
        System.out.println("Division: "+Division);

        scanner.close();
    }
    
}
