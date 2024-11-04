import java.util.Scanner;

public class Vowelconsonant {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char alphabet = scan.next().charAt(0);

        if(alphabet=='a' || alphabet=='e' || alphabet== 'i'||alphabet== 'o' || alphabet== 'u' ){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        scan.close();
    }
    
}
