import java.util.Scanner;

public class Trianglenumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dimensions: ");
        int a = scan.nextInt();

        for(int i=0; i<=a; i++){
            for(int j= a-i; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i;j++){
                System.out.print(i+" " );
            }
            System.out.println();
        }
        scan.close();
    }
}
