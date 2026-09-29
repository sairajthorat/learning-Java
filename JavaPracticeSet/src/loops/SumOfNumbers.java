package loops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println("Printing the Sum of Numbers");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number to Print Sum");
        int range=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=range;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);
    }
}
