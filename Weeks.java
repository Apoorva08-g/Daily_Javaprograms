import java.util.Scanner;

public class Weeks {
    public static void main(String[] args){

        Scanner w = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int d= w.nextInt();

        if(d==1){
            System.out.println("The day will be Monday.");
        }
        else if(d==2){
            System.out.println("The day will be Tuesday.");
        }
        else if(d==3){
            System.out.println("The day will be Wednesday.");
        }
        else if(d==4){
            System.out.println("The day will be Thursday.");
        }
        else if(d==5){
            System.out.println("The day will be Friday.");
        }
        else if(d==6){
            System.out.println("The day will be Saturday.");
        }
        else if(d==7){
            System.out.println("The day will be Sunday.");
        }
        else{
            System.out.println("Invalid value entered");
        }
        w.close();
    }
    
}
