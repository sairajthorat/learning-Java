package loops;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Finding The Factorial with For Loop");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number to Find factorial");
        double num=scanner.nextInt();
        double fact=1;
        long starttime1=System.nanoTime();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        long endtime1=System.nanoTime();
        System.out.println("Factorial="+fact);
        System.out.println("Using For "+(endtime1-starttime1));

        
        System.out.println("Finding factorial with While loop");
        fact=1;
        int i=1;
        long starttime2=System.nanoTime();
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        
        long endtime2=System.nanoTime();
        System.out.println("Factorial by while "+fact);
        System.out.println("Using while "+(endtime2-starttime2));

        System.out.println("Finding Factorial using the Recursion");
        long starttime3=System.nanoTime();
        double ans=factorial(num);
        long endtime3=System.nanoTime();
        System.out.println("Factoril by recurssion "+ans);
        System.out.println("Using recursion "+(endtime3-starttime3));


    }
    public static double factorial(double num)
    {

        if(num<=1)
        {
            return 1;
        }
        return(num*factorial(num-1));
    }
}