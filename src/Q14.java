import java.util.Scanner;

public class Q14 {
    public static void main (String arg[]){
        Scanner scan = new Scanner(System.in);

//------------------     Requesting Value   ------------------------------

        System.out.println("Enter any Value :");

        char ch = scan.next().charAt(0);

//------------------      If Else                ---------------------------------
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("Alphabets");
        }
        else if ((ch >= '0' && ch <= '9'))
        {
            System.out.println("Digit");
        }
        else
            System.out.println("Character");
        }
        }

