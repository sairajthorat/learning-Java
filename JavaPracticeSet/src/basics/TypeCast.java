package basics;
public class TypeCast {
    public static void main(String[] args) {
        System.out.println("Learning abt TypeCasting");

        System.out.println("----Widening Casting----");
        System.out.println("converting a smaller type to a larger type size");
        System.out.println("byte --> short --> char --> int --> long --> float --> double");

        int num=54;
        System.out.println("int num --> "+num);
        long num2=num;
        System.out.println("long num --> "+num2);
        double num3=num2;
        System.out.println("double num --> "+num3);

        System.out.println("----Narrowing Casting(done Manualy)----");
        System.out.println("done manually by placing the type in parentheses () in front of the value.");
        System.out.println("double --> float --> long --> int --> char --> short --> byte");

        double dub1=3.14d;
        System.out.println("double dub1 = "+dub1);
        int myInt=(int)dub1;
        System.out.println("int dub1 = "+myInt);
    }
}
