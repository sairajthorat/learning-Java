package conditional_statements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Finding if Year is Leaf or not");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Year u want to check");
        int year=scanner.nextInt();
        if(year%4==0)
        {
            System.out.println("This is Leap Year");
        }
        else
        {
            System.out.println("Naot a leap year");
        }
        scanner.close();
    }
}
