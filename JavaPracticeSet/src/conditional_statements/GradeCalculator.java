package conditional_statements;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        System.out.println("Grade calculator");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks of Physics");
        float phy=scanner.nextFloat();
        System.out.println("Enter marks of Chemistry");
        float chem=scanner.nextFloat();
        System.out.println("Enter marks of Biology");
        float bio=scanner.nextFloat();
        System.out.println("Enter marks of Math");
        float math=scanner.nextFloat();
        System.out.println("Enter marks of English");
        float eng=scanner.nextFloat();

        float percentage=(eng+chem+bio+math+phy)/5;
        System.out.println("Percentage -->"+percentage);
        if(percentage>=90 && percentage<=100)
        {
            System.out.println("Grade --> A");
        }
        else if(percentage>=75 && percentage<90)
        {
            System.out.println("Grade --> B");

        }
        else if(percentage>=35 && percentage<75)
        {
            System.out.println("Grade --> c");
        }
        else if(percentage>=0 && percentage<35)
        {
            System.out.println("Fail");


        }
        else
        {
            System.out.println("Entered Invalid Marks");
        }
    }
}
