import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter you age: ");
        int age = scanner.nextInt();

        if(age>= 18){
            System.out.println("You are Eligible!");
        }
        else{
            System.out.println("You are not eligible.");
        }
    scanner.close();    

    }
    
}
