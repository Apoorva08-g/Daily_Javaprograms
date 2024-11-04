import java.util.Scanner;

public class Largest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        int a = scan.nextInt();
        System.out.print("Enter the second no.: ");
        int b = scan.nextInt();
        System.out.print("Enter the third no.: ");
        int c = scan.nextInt();

        if(a>b){
            if(a>c){
                System.out.print(a+ " is the greatest no.");
            }
            else{
                System.out.print(c +" is the greatest no.");
            }
        }
        else{
            if(b>c){
            System.out.print(b+" is the greatest no.");
        }
        else{
            System.out.print(c+ " is the greatest no. ");
        }
        scan.close();
    }
    
}
}
