import java.util.Scanner;

public class Signandmagnitude {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the no.: ");
        int num = scan.nextInt();

        if(num>0){
            if(num>100){
                System.out.print("Positive large");
            }
            else{
                System.out.print("Positive small");
            }
        }
        else{
            if(num>= -100){
                System.out.print("Negative small");
            }
            else{
                System.out.print("Negative large");
            }
        }     

        scan.close();
    }
    
}
