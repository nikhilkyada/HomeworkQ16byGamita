import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //--------------------Requesting value 1 to 7-------------------------------
        System.out.println("Enter value between 1 to 7 :");
        int a=scan.nextInt();


//================================    IF Else     ===========================================
        if (a == 1)
        {
            System.out.println( a+ " day of week is Monday. ");
        }else if (a == 2 )
        {
            System.out.println(a+ " day of week is Tuesday. ");
        }else if ( a == 3)
        {
            System.out.println(a+ " day of week is Wednesday. ");
        }else if (a == 4)
        {
            System.out.println(a+ " day of week is Thursday. ");
        }else if (a == 5){
            System.out.println(a+ " day of week is Friday. ");
        }else if ( a == 6){
            System.out.println(a+ " day of week is Saturday. ");
        }else if (a == 7) {
            System.out.println(a + " day of week is Sunday. ");
        }
        if (a >=8){
            System.out.println("Please Check Entered value .");
        }
    }
}
