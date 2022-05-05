import java.util.Scanner;

public class Q13Symboles {

    public static void main (String arg[]){
        char ch;
        Scanner scan=new Scanner(System.in);
        //--------------------------------------   1st and 2nd number    -------------------------------------

        System.out.print("Enter the first number");
        int num1= scan.nextInt();
        System.out.print("Enter your second number");
        int num2=scan.nextInt();

        //------------------------------------------   Operetor     ---------------------------------------------

        System.out.print("Enter the operator you want (+,-,*,/)");
        ch=scan.next().charAt(0);

        //---------------------------------------------  If Else    ----------------------------------------------

        if (ch=='+'){
            System.out.println("\nAddition of "+num1 +"+"+num2 +"="+(num1+num2));
        } else if (ch=='-'){
            System.out.println("\nSubstraction of "+num1+ "-"+num2 +"="+(num1-num2));
        }else if (ch=='*'){
            System.out.println("\nMultiplication of "+num1+"*"+num2 +"="+(num1*num2));
        }else if (ch=='/') {
            System.out.println("\nDivision of " + num1 + "/" + num2 + "=" + (num1 / num2));
        }
        else {
            System.out.println("Operator is invalid");
        }



    }
}
