import java.util.Scanner;

public class Q6 {
    public static void main (String arg[]){

        //----------------------------------------Name, ID, Pay---------------------------------
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of employee :");
        String name =scan.next();
        name+= scan.nextLine();
        System.out.println("Enter Employee ID :");
        int id = scan.nextInt();
        System.out.println("Enter Basic Pay :");
        double pay = scan.nextDouble();
//------------------------------------------------HRA,DA,TA,PF,GrossPay-----------------------------
        double hra = pay*10/100;
        System.out.println("HRS = "+hra);
        double da =pay*8/100;
        System.out.println("DA ="+da);
        double ta =pay*9/100 ;
        System.out.println("TA = "+ta);
        double pf =pay*20/100;
        System.out.println("PF = " +pf);
        double gross = pay+hra+da+ta-pf;
        System.out.println("Gross pay ="+gross);

    }
}
