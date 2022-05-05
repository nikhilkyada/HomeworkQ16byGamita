import java.util.Scanner;

public class Q1Turnery {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter any one number :"); //request a data input
        int n = scan.nextInt();

        //        for (int i >=50; && i <=100; ){

        System.out.println(n % 2 == 0 ? n + " is even number ": n+ " is Odd number");
        }

        //System.out.println((a % 2) == 0 ? a + " is Even number" : a+ " is Odd number");
    }

