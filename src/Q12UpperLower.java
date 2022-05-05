import java.util.Scanner;

public class Q12UpperLower {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);

//------------      Requesting input    -------------------------------------------------
        System.out.println("Enter any Alphabets in Uppercase :");//Asking for input
        char a1=scan.next().charAt(0);
        char ch2;

//==========if Else=======================================================
        if(a1>='A' && a1<='Z')
        {
            ch2=Character.toLowerCase(a1);
            System.out.println("Lowercase "+ ch2);
        }
        }
}
