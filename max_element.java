import java.util.Scanner;

public class max_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int e = arr[i];
            if (e > max) {
                max = e;            
            }
        }
        System.out.println(max);
    }
}

