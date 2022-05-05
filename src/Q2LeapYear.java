import java.util.Scanner;

public class Q2LeapYear {

    //cenctury divided by 4 & 400
    //year is divided by 100

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //=============================================Enter year=============================================

        System.out.println("Enter any year in number (ex. 2020) :");
        int y = scan.nextInt();

//======================================================IF Else============================================
        if (y % 400 == 0 && y % 100 == 0) {
            System.out.println(y + " is leap");
        } else if (y % 100 != 0 && y % 4 == 0) {
            System.out.println(y + " is leap year");
        } else
            System.out.println(y + " is not a leap year");

    }
}







