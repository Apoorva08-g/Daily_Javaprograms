import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String password = s.nextLine();

        switch(password){
            case "abcd":
            System.out.println("Incorrect password.");
            break;

            case "ghijk":
            System.out.println("Incorrect password.");
            break;

            case  "lmnop":
            System.out.println("Incorrect password.");
            break;
            
            case  "abc@3":
            System.out.println("Welcome.");
            break;

            default:
                    System.out.println("Enter valid password.");

        }
        s.close();

    }
    
}
