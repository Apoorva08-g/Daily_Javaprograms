import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int n= a.nextInt();

        switch (n){
            case 100:
            System.out.println("1. Access Granted");
            break;

            case 90:
            System.out.println("2. Access Granted");
            break;

            case 80:
            System.out.println("3. Access Granted");
            break;
        default:
            System.out.println("Access  Denied");
            break;
        }    

        a.close();
    }
    
}
