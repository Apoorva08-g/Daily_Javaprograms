import java.util.Scanner;

public class Dayoftheweek {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day = scan.nextInt();

        switch(day)
        {
            case 1:
            System.out.print("Sunday");
            break;

            case 2:
            System.out.print("Monday");
            break;

            case 3:
            System.out.print("Tuesday");
            break;
            
            case 4:
            System.out.print("Wednesday");
            break;

            case 5:
            System.out.print("Thursday");
            break;

            case 6:
            System.out.print("Friday");
            break;

            case 7:
            System.out.print("Saturday");
            break;

            default:
            System.out.print("Invalid");
            break;

        }
        scan.close();
    }
    
}
