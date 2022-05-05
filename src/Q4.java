import java.util.Scanner;

public class Q4 {

    public static void main (String arg []){
        Scanner scan = new Scanner(System.in);
//-------------------------------Name & Roll number-----------------------------------
        System.out.println("Enter the Name of Student :");
        String name1=scan.next();

        System.out.println("Enter Roll Number :");
        long numb1= scan.nextLong();

        System.out.println("Name :"+name1);
        System.out.println("Roll number :"+numb1);
//----------------------------------Subjects --------------------------------------------
        System.out.println("Enter Maths marks   =");
        double m= scan.nextInt();

        System.out.println("Enter English marks =");
        double e= scan.nextInt();

        System.out.println("Enter Gujarati marks =");
        double g= scan.nextInt();


//======================IF Else========================================Pass& Fail
        if (m >=35 && e>=35 && g>=35){
            System.out.println("Paas");
        }
        else {
            System.out.println("Fail");
        }

     }
}
