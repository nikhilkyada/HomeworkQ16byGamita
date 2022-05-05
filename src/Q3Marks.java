import java.util.Scanner;

public class Q3Marks {
    //Globle Variable...................................................................

    static int total,percent;

    //================================main method========================================================

    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

        //-------------------NAme and Roll no.--------------------------------------------------

        System.out.println("Enter Student Name :");    //Name of student
        String name = scan.next();
        name+= scan.nextLine();
        System.out.println("Enter Roll number :"); //Roll number
        long num = scan.nextLong();

        //----------------------------Subjects---------------------------------------------------------------
        System.out.println("Enter Maths =" );
        int maths= scan.nextInt();

        System.out.println("Enter English =");
        int eng = scan.nextInt();

        System.out.println("Enter Gujarati =");
        int guj = scan.nextInt();

        //----------------------------------Total & Percentage--------------------------------------------------------------
        total = maths + eng + guj;
        System.out.println("Total marks ="+total);
        percent = total/3;
        System.out.println("Percentage = "+percent);

//        ----------------------------------If Else-----------------------------------------------------
        if (total>=250) {
            System.out.println("Grad = A++");
        }
        else if (total>=220)
        {
            System.out.println("Grad = A");
        }
        else if (total>=150){
            System.out.println("Grad = B");
        }
        else if (total>=120){
            System.out.println("Grad = C");
        }
        else if(total>=106){
            System.out.println("Grad = D");
        }
        else if (total<=105){
            System.out.println("Grad = E");
        }
        if (percent>=35){
            System.out.println("Status = PASS");
            System.out.println("CONGRATULATIONS");
        }
        else
            System.out.println("Status = FAIL \nBetter luck next time");



    }
}