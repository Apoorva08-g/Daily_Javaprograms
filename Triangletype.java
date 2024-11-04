import java.util.Scanner;

public class Triangletype {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int side1 = scan.nextInt();
        System.out.print("Enter the second side: ");
        int side2 = scan.nextInt();
        System.out.print("Enter the third side: ");
        int side3 = scan.nextInt();

        if(side1 == side2){
            if(side2 == side3){
                System.out.print("Its an equilateral Triangle.");
            }
            else{
                System.out.print("Its an isosceles Triangle.");
            }
        }
        else{
            System.out.print("Its a scalene Triangle");
        }
        scan.close();
    }
}
