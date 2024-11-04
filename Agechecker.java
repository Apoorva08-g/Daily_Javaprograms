import java.util.Scanner;

public class Agechecker {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scan.nextInt();

        if(age<18){
            System.out.print("Minor");
        }
        else if(age>=18 && age<=64){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }
scan.close();

    }
    
}
