import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name +"!" );

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age +"years old.");

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.println("Your height is  "+ height +" meters");

        scanner.close();
    }
}
