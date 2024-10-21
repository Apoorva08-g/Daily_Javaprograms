public class Subjects {

    public static void main(String[] args){
        int English = 40;
        int Hindi = 45;
        int Maths = 50;
        int Science = 44;
        int Sst = 40;

        int Total= English + Hindi + Maths + Science + Sst;
        int avg= Total/5;
        int perc= (Total*100)/250;

        System.out.println("The total marks are: "+ Total);
        System.out.println("The average marks will be: "+ avg);
        System.out.println("The percentage will be: "+ perc +"%");
    }
    
}
