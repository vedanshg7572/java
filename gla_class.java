import java.util.Scanner;

public class gla_class {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a year:");
            int year = sc.nextInt();
            leapyear(year);
        }

        public static void leapyear(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " leap ");
            } else {
                System.out.println(year + " not leap");
            }
        }
}

