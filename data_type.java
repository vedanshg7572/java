import java.util.Scanner;

public class data_type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number in byte ");
        byte b=sc.nextByte();
        System.out.print("enter the number in short ");
        short s = sc.nextShort();
        System.out.print("enter the number in int ");
        int i =sc.nextInt();
        System.out.print("enter the number in long ");
        long l =sc.nextLong();
        System.out.println("byte number is "+b);
        System.out.println(("short number is "+s));
        System.out.println("int number is "+ i);
        System.out.println("long number is "+l);
        System.out.print("enter the number in float  ");
        float f=sc.nextFloat();
        System.out.print("enter the number in double ");
        double d=sc.nextDouble();
        System.out.print("enter the single character  ");
        char c=sc.next().charAt(0);
        System.out.print("enter true or false ");
        boolean t=sc.nextBoolean();
        System.out.println("float number is "+f);
        System.out.println("double number is "+d);
        System.out.println("char number is "+c);
        System.out.println("boolean is "+t);
    }
}
