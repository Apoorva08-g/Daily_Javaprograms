import java.util.Scanner;

public class Access {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if(name.equals("Apoorva")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Access Denied!");
        }
        scanner.close();
    }    
}
