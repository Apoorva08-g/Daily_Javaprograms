import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the no. till the fibonacci series has to be printed: ");
        int n= scan.nextInt();

        int a=0, b=1;
        System.out.print("Fibonacci sequence: "+ a+ " "+ b);

        for(int i=0;i<n;i++){
            int c= a+b;
            System.out.print(" "+ c);
            a=b;
            b=c;
        }
        scan.close();
    }
    
}
