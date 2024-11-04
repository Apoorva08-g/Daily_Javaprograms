import java.util.Scanner;           

public class Gradechecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the marks out of 100: ");
        int marks = scan.nextInt();

        if(marks>=90 && marks<=100){
            System.out.println("A");
        }
        else if(marks<90 && marks>=80){
            System.out.println("B");
        }
        else if(marks<80 && marks>=70){
            System.out.println("C");
        }
        else if(marks<70 && marks>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

        scan.close();
    }
}
