import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double percentage= scanner.nextDouble();

        if (percentage >= 95){
            System.out.println("Your Grade is A+");
        }
        else{
                if (percentage >=85){
                    System.out.println("Your Grade is A");
                }
                else{
                    if (percentage >=75){
                        System.out.println("Your Grade is B");
                    }
                    else{
                        if (percentage >=65){
                            System.out.println("Your Grade is C");
                        }
                        else{
                            if(percentage >=55){
                                System.out.println("Your Grade is D");
                            }
                            else{
                                if(percentage >=45){
                                    System.out.println("Your Grade is E");
                                }
                                else{
                                    System.out.println("Your Grade is F");
                                }
                            }
                        }
                    }
                }
            }
            scanner.close();
        }
    }


        