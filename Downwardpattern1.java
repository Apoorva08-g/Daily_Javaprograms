import java.util.Scanner;

public class Downwardpattern1 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the dimension: ");
        int a = scan.nextInt();

        for(int i=a; i>0; i--){
            for(int j=a-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
    
}
