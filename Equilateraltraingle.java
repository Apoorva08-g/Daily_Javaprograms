import java.util.Scanner;

public class Equilateraltraingle {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the dimension: ");
        int d= scan.nextInt();

        for(int i=0; i<=d; i++){
            for(int j=d-i; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
    
}
