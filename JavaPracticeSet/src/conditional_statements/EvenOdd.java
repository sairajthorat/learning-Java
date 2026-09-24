package conditional_statements;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Checking if no is Even or odd");
        System.out.println("Enter Number");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int rem=num1%2;
        if(rem==0){
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("number os odd");
        }
    }

}
