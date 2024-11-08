import java.util.Scanner;

public class Downwardpatternalpha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dimensions: ");
        int n = scan.nextInt();

        for(int i=n; i>0; i--){
            for(int j=n-i; j>0;j--){
                System.out.print(" ");
            }
            for(int j=i; j>0;j--){
                System.out.print("A");
            }
            System.out.println();
        }
        scan.close();
    }
    
}
