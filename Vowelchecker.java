import java.util.Scanner;

public class Vowelchecker {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.err.print("Enter the Alphabet: ");
        char alphabet = scan.next().charAt(0);

        switch(alphabet){
            case 'a':
            {
            System.out.println("Vowel");
            }
            break;

            case 'e':
            {
            System.out.println("Vowel");
            }
            break;

            case 'i':
            {
            System.out.println("Vowel");
            }
            break;
            
            case 'o':
            {
            System.out.println("Vowel");
            }
            break;

            case 'u':
            {
            System.out.println("Vowel");
            }
            break;

            default:
            {
                System.out.print("Consonant");
            }

        }
        scan.close();
    }
    
}
