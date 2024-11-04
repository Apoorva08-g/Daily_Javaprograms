import java.util.Scanner;

public class Calculatorswitch {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        int first = scan.nextInt();
        System.out.print("Enter the second no.: ");
        int second = scan.nextInt();
        System.out.print("Enter the operation you want to perform- \n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n ");
        int operation = scan.nextInt();
        
        switch(operation){

            case 1:
            System.out.print( first+second );
            break;

            case 2:
            System.out.print( first-second);
            break;

            case 3:
            System.out.println( first*second);
            break;

            case 4:
            System.out.print( first/second);
            break;

            default:
            System.out.println("Invalid operation entered.");
        }
        scan.close();
    }
    
}
