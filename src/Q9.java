import java.util.Scanner;

public class Q9 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
//-----------------------------------------Sale ID, Seller id, Sales ,Basic salary--------------------------
        System.out.println("Enter sale ID :");
        int id = scan.nextInt();

        System.out.println("Enter Seller name :");
        String name = scan.next();
        name+=scan.nextLine();

        System.out.println("Enter Sales sale :");
        double sale = scan.nextFloat();

        System.out.println("Enter Basic Salary :");
        double basic = scan.nextDouble();
        //sales >=50,000 35%
        //>=30,000 20%
        //>=20,000 10%
        //>=10,000 5%
        //<10,000 2%
//===========================================IF Else======================================================
        if (sale >= 50000){
            System.out.println("Commition is ="+ sale*35/100 );
        }else if (sale >= 30000){
            System.out.println("Commition is ="+ sale*20/100);
        }else if (sale >= 20000){
            System.out.println("Commition is ="+ sale*10/100);
        }else if (sale >=10000){
            System.out.println("Commition is ="+ sale*5/100);
        }else if (sale <10000) {
            System.out.println("Commition is ="+sale *2/100);
        }
    }
}
