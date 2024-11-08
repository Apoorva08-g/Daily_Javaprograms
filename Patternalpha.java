import java.util.Scanner;

public class Patternalpha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dimensions: ");
        int n= scan.nextInt();


        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("A");
            }
            System.out.println();
        }
        scan.close();
    }
    
}
