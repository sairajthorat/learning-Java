package conditional_statements;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        System.out.println("Finding Largest Number");
        System.out.println("Enter First Number");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();

        System.out.println("Enter Second Number");
        int num2=scanner.nextInt();

        System.out.println("Enter Third Number");
        int num3=scanner.nextInt();

        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("Largest Number -->"+num1);
            }
        }
        else if(num2>num3)
        {
            System.out.println("Largest  number -->"+num2);
        }
        
        else
        {
            System.out.println("Lagest Number -->"+num3);
        }
    }
}
