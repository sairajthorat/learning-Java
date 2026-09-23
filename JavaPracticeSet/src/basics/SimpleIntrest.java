package basics;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        System.out.println("Simple Intrest");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Amount");
        int p=scanner.nextInt();
        System.out.println("Enter Rate Percentage");
        int r=scanner.nextInt();
        System.out.println("Enter Time");
        int t=scanner.nextInt();

        int se;
        se=(p*r*t)/100;
        System.out.println("Your Intrest --->"+se);
    }
}
