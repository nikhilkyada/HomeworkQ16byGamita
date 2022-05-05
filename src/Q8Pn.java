import java.util.Scanner;

public class Q8Pn {

//Main method======================================================
    public static void main (String arg[]){

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any number (+ve or -ve or 0)");
        int num = Integer.parseInt(scan.next());

        //--------------------------------------------------------If Else---------------------------------
        if (num==0)
        {
            System.out.println(num+" is Zero");
        }
        else if (num>0)
        {
            System.out.println(num+ " is Positive");
        }
        else
            System.out.println(num+ " is Negative");
    }
}
