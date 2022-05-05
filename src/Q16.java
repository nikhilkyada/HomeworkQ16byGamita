import java.util.Scanner;

public class Q16 {


    public static void main (String arg[]){

        Scanner scan = new Scanner(System.in);

        //--------------------------  Requesting Aplphabet  --------------------------------
        System.out.println("Enter ony One Aplphabet ");
        char aa= scan.next().charAt(0);

        //============================  If Else  =========================================

        if (aa=='a'||aa=='e'||aa=='i'||aa=='o'||aa=='u'||aa=='A'||aa=='E'||aa=='I'||aa=='O'||aa=='U')
        {
            System.out.println("Entered charector "+aa+ " is Vowel");
        }
        else if (aa>='a' && aa <='z' || aa >='A' && aa <='Z')
        {
            System.out.println("Entered charector " + aa + " is consonant");
        }
        else
            System.out.println(" Please Enter a valid Aplphabet.");


    }
}
