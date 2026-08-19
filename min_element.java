import java.util.Scanner;

public class min_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int min=arr[0];
        for (int i =0 ;i<arr.length;i++){
            int e = arr[i];
            if(e>min){
                min=e;
            }
        }
        System.out.println(min);
//        int second = arr[arr.length - 1];
//        System.out.println(second);
    }
}
