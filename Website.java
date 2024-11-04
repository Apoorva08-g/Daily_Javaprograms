import java.util.Scanner;

public class Website {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Domain name: ");
        String Domain_name = scanner.nextLine();
        System.out.println("Enter the Domain type: ");
        String Domain = scanner.nextLine();

        switch(Domain){
            case ".com":
            {
                System.out.println(Domain_name + "is a comercial website.");
            }
            break; 
            
            case ".in":
            {
                System.out.println(Domain_name + "is an Indian website.");
            }
            break;

            case ".org":
            {
                System.out.println(Domain_name+ "is an organizational website.");
            }
            break;

            default:
            {
                System.out.println("Does not exist.");
            }
            break;

            }
            scanner.close();
        }
    }

        