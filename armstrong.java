import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int m;
        int count=0;
        m=n;
        int j = n;
        while (n>0){
            int digit = n%10;
            n=n/10;
            sum+=Math.pow(digit,3);
        }if (m==sum){
            System.out.println("Yes,it is an armstrong number.");
        }else {
            System.out.println("No,it is not an armstrong number.");
        }
    }
}
