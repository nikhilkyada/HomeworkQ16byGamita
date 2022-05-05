import java.util.Scanner;

public class Q7Five {


//Main method=======================================================================
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//================================================================Five values========================
        System.out.println("Please Enter first out of Five digit :");
        int num1 =scan.nextInt();
        int a1=num1;
        System.out.println("Please Enter second out of Five digit :");
        int num2 =scan.nextInt();
        int a2=num2;
        System.out.println("Please Enter Third out of Five digit :");
        int num3=scan.nextInt();
        int a3=num3;
        System.out.println("Please Enter fourth out of Five digit :");
        int num4 = scan.nextInt();
        int a4=num4;
        System.out.println("Please Enter fifth out of Five digit :");
        int num5=scan.nextInt();
        int a5=num5;
        //----------------------------------------------Avareg-------------------------------------------------
        float ava=(a1+a2+a3+a4+a5)/5;
        System.out.println("Averege of " +a1+" "+a2+" "+a3+" "+a4+" "+a5+" " +" is "+ava);

    }
}
