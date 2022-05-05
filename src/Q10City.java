import java.util.Scanner;
public class Q10City {

// ---------------------Globle variable-------------------------------------------

    static String a="Ahmedabad";
    static String b="Bharuch";
    static String c="Chatisgardh";
    static String d="Dholera";
    static String e="Eddingburg";
    static String f="Faridabad";

//=======================Main method=========================================================
    public static void main(String arg[]) {
        char ch;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any Charector a to f :");
        ch=scan.next().charAt(0);
//-------------------------If Else-------------------------------
        if ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F')){
        if (ch=='a' || ch=='A')
            System.out.println(a);

        else if (ch=='b' || ch=='B')
        {
            System.out.println(b);
        }
        else if(ch=='c'|| ch=='C')
        {
            System.out.println(c);
        }
        else if (ch=='d' || ch=='D')
        {
            System.out.println(d);
        }
        else if (ch=='e'||ch=='E')
        {
            System.out.println(e);
        }
        else if (ch=='f'||ch=='F')
        {
            System.out.println(f);
        }
        else
        {
            System.out.println("Enter valid Charactor between a to f or in small case");
        }}}


    }