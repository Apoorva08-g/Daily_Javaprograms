import java.util.Scanner;

public class EvenOdd {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the no.: ");
        int a = scan.nextInt();

        if(a%2==0){
            System.out.print("The no. is even.");
        }
        else{
            System.out.print("The no. is Odd. ");
        }

        scan.close();
    }
    
}
