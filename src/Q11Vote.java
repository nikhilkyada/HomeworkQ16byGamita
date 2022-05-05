import java.util.Scanner;

public class Q11Vote {

    public static void main (String arg[]){

        Scanner scan=new Scanner(System.in);
        //============================================    Age   ================================
        System.out.println("Enter your age :");
        int age = scan.nextInt();
        //------------------------   IF Else    ---------------------------------
        if (age>=18){
            System.out.println("Eligible for Vote.");
        }else
        {
            System.out.println("Not Eligible for Vote");
        }
    }
}
