import java.util.Scanner;

public class Q5Interchange {

    public static void main (String arg[]){
        Scanner scan = new Scanner(System.in);

        //asking 1st Value-------------------------
        System.out.println("Enter 1st value :");
        int a1 = scan.nextInt();

        //asking 2nd value
        System.out.println("Enter 2nd Value :");
        int a2 = scan.nextInt();

        System.out.println("Entered value was "+a1+ " and " +a2+ " is inter-changed to " +a2+ " and " +a1);

    }
}
