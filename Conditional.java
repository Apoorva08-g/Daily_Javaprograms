import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the first variable: ");
        int a= scanner.nextInt();

        System.out.println("Enter the second variable: ");
        int b= scanner.nextInt();
        
        if(a>= b){
            System.out.println("a is greater than b.");
        }
        else{
            System.out.println("A is not greater than b.");
        }

        if(a<=b){
            System.out.println("a is less than b.");
        }
        else{
            System.out.println("a is not less than b.");
        }

        if (a== b){
            System.out.println(" a is equal to b.");        
        }
        else{
            System.out.println("a is not equal to b.");
        }

        if(a!= b){
            System.out.println("a is not equal to b.");
        }
        else{
            System.out.println("a is equal to b");
        }
        scanner.close();
    }

    
}
