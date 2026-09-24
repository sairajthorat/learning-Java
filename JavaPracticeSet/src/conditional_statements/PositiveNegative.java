package conditional_statements;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println("Checking if Number is Positive or Negative");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=scanner.nextInt();
        if(num>0)
        {
            System.out.println("Number is Positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}
