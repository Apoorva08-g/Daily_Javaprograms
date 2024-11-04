import java.util.Scanner;

public class Seasonchecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = scan.nextInt();
        
        switch(month){
            case 1:
            {
                System.out.print("Winter");
            }
            break;
            
            case 2:
            {
                System.out.print("Winter");
            }
            break;

            case 3:
            {
                System.out.print("Spring");
            }
            break;

            case 4:
            {
                System.out.print("Spring");
            }
            break;

            case 5:
            {
                System.out.print("Spring");
            }
            break;

            case 6:
            {
                System.out.print("Summer");
            }
            break;

            case 7:
            {
                System.out.print("Summer");
            }
            break;

            case 8:
            {
                System.out.print("Summer");
            }
            break;

            case 9:
            {
                System.out.print("Autumn");
            }
            break;

            case 10:
            {
                System.out.print("Autumn");
            }
            break;

            case 11:
            {
                System.out.print("Autumn");
            }
            break;

            case 12:
            {
                System.out.print("Winter");
            }
            break;

            default:
            {
                System.out.print("Invalid");
            }
        }
        scan.close();

    }
    
}
