import java.util.Scanner;

public class Gradingnested {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the score: ");
        int score = scan.nextInt();

        if (score >= 70){
            if(score >90){
                System.out.print("Excellent");
            }
            else{
                System.out.print("Good");
            }
        }    
        else{
            if(score>50){
                System.out.print("Average");
            }
            else{
                System.out.print("Poor");
            }
        }
        scan.close();
    }
    
}
