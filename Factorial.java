import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int a = scan.nextInt();

        int factorial = 1;
        
        for(int i=1; i<=a; i++){
            factorial = factorial*i;
        }
        System.out.print(factorial);

        scan.close();
    }
    
}
