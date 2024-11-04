import java.util.Scanner;

public class Dayandnight {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the hour: ");
        int hour = scan.nextInt();

        if(hour >=4 && hour<16 ){
            if(hour<12 )
            {
                System.out.print("Morning");
            }
            else{
                System.out.print("Afternoon");
            }
        }
        else{
            if(hour>= 16 && hour<= 19){
                System.out.print("Evening");
            }
            else{
                System.out.print("Night");
            }
        }
        scan.close();
    }    
}
