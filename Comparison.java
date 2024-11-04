import java.util.Scanner;

public class Comparison {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the first no.: ");
        int a= sc.nextInt();
        System.out.print("Enter the second no.: ");
        int b= sc.nextInt();
        System.out.print("Enter the third no.: ");
        int c= sc.nextInt();

        if(a>b){
            if(a>c){
            System.out.println("a is the greatest.");
        }
        else{
            System.out.println("c is the greatest.");
        }
    }
    else{
        if(b>c){
            System.out.println("b is greatest.");
        }
        else{
            System.out.println("c is the greatest.");
        }
    }
    sc.close();
}

}
