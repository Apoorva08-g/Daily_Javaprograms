import java.util.Scanner;

public class Inputcal {
    public static void main(String[] args){

        Scanner j = new Scanner(System.in);

        System.out.print("Enter the first no.: ");
        int a = j.nextInt();
        System.out.print("Enter the second no.: ");
        int b = j.nextInt();

        System.out.print("Select the operation you want  to perform 1.Addition 2.Subtraction 3.Division 4. Multiplication: ");
        int k = j.nextInt();

        int add= a+b;
        int sub= a-b;
        int div= a/b;
        int mul= a*b;

        switch(k){
            
            case 1:
            {
                System.out.print("The answer will be "+ add );
            }
            break;

            case 2:
            {
                System.out.print("The answer will be "+ sub);
            }
            break;
            
            case 3:
            {
                System.out.print("The answer will be "+ div);
            }
            break;

            case 4:
            {
                System.err.print("The answer will be "+ mul);
            }
            break;

            default:
            {
                System.out.print("Invalid input.");
            }
            break;

        }
        j.close();
    }
    
}
