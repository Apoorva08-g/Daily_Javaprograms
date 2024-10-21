import java.util.Scanner;

public class Assignmentop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the variable: ");
        int a = scanner.nextInt();

        System.out.println("The variable is a: " + a );

        a+= 5;
        System.out.println("a+=5: " + a);

        a-= 3;
        System.out.println("a-= 4: " +a);

        a*= 2;
        System.out.println("a *= 2: " + a);

        a/= 4;
        System.out.println("a/= 2: "+a );

        a%= 5;
        System.out.println("a%= 3: "+a);

        scanner.close();
    }
    
}
