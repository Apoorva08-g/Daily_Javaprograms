import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        double year = scan.nextDouble();

        if(year% 4==0){
            System.out.println("Its a leap year.");
        }
        else{
            System.out.println("Its not a leap year.");
        }
        scan.close();
    }
    
}
