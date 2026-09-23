package basics;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Learning abt Data Types");
        System.out.println("Data Types In java");
        System.out.println("---Byte---");
        System.out.println("Range = -128 --> 127");
        System.out.println("Size-->8 bits");
        byte b1=-128;
        byte b2=127;
        //byte b3=-129; cant shore bcz bye it only of 8 bits
        //byte b3=128; cant shore bcz bye it only of 8 bits 
        System.out.println("Byte b1="+b1);
        System.out.println("\n---short---");

        System.out.println("\n--short--");
        System.out.println("Range --> -32,768 To 32767");
        System.out.println("Size --> 16 bits");
        short s1=32767;
        //short s2=32768; cant store bcz short it only of 16 bits
        //short s3=-32769; cant store bcz short it only of 16 bits
        System.out.println("Short s1="+s1);


        System.out.println("\n--int--");
        System.out.println("Range --> -2,147,483,648 To 2,147,483,647");
        System.out.println("Size --> 32 bits");
        int i1=2147483647;
        //short i2=-2147483649; cant store bcz int is only of 32 bits
        //short i3=2147483648; cant store bcz int is only of 32 bits
        System.out.println("int i1="+i1);


        System.out.println("\n--long--");
        System.out.println("Range --> -9,223,372,036,854,775,808 To 9,223,372,036,854,775,807");
        System.out.println("Size --> 64 bits");
        long l1=9223372999l;
        //long l2=-9223372036854775809l; cant store bcz int is only of 64 bits
        //long l3=9223372036854775808l; cant store bcz int is only of 64 bits (Write l everytime at end)
        System.out.println("Long l1="+l1);

        System.out.println("\n--float--");
        System.out.println("Range --> -3.4028235E38 To 3.4028235E38");
        System.out.println("Size --> 32 bits");
        float f1 = 123.45f;
        float f2 = 3.4028235E38f;
        // float f3 = 3.4028236E38f; // Cannot store: exceeds float range
        // Write f at the end of a float value
        System.out.println("Float f1=" + f1);


        System.out.println("\n--double--");
        System.out.println("Range --> -1.7976931348623157E308 To 1.7976931348623157E308");
        System.out.println("Size --> 64 bits");
        double d1 = 123.456789;
        double d2 = 1.7976931348623157E308;
        // double d3 = 1.7976931348623159E308; // Cannot store: exceeds double range
        // d is optional because decimal values are double by default
        System.out.println("Double d1=" + d1);
        

        String str1="Hello My name is Sairaj";
        System.out.println(str1);
        System.out.println("Whats ur's");
        String username=scanner.nextLine();
        System.out.println("Hello "+username);
    }

}
