import java.util.Scanner;

public class Additionconstructor {
    int a, b;

    Additionconstructor(){
        System.out.print("Enter the first no.: ");
        a= scan.nextInt();
        System.out.print("Enter the second no.: ");
        b= scan.nextInt();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Additionconstructor myobj = new Additionconstructor();
        System.out.print("The sum will be: "+ (myobj.a + myobj.b));
        scan.close();
    }
    
}
