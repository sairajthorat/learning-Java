package basics;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        
        System.out.println("Practicing Java Basics");

        System.out.println("Entern First Number");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();

        System.out.println("Enter Second Number");
        int num2=scanner.nextInt();

        System.out.println("Addition="+(num1+num2));
    }

}
