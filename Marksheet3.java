import java.util.Scanner;

public class Marksheet3 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("Enter Marks of English: ");
        double english= s.nextDouble();

        System.out.println("Enter Marks of Hindi: ");
        double hindi= s.nextDouble();

        System.out.println("Enter Marks of Maths: ");
        double maths= s.nextDouble();

        System.out.println("Enter Marks of Science: ");
        double science= s.nextDouble();

        System.out.println("Enter Marks of Social Studies: ");
        double sst= s.nextDouble();

        double sum = english+ hindi+ maths+ science+ sst;

        double percentage = (sum*100)/500;

        if(percentage>= 95){
            System.out.println("Your Grade is A+.");
        }
        else if(percentage>= 85){
            System.out.println("Your Grade is A.");
        }
        else if(percentage>= 75){
            System.out.println("Your Grade is B.");
        }
        else if(percentage>= 65){
            System.out.println("Your Grade is C.");
        }
        else if(percentage>= 55){
            System.out.println("Your Grade is D");
        }
        else if(percentage>= 45){
            System.out.println("Your Grade is E.");
        }
        else{
            System.out.println("Your Grade is F.");
        }
        s.close();

    }
    
}
