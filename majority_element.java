import java.sql.SQLOutput;
import java.util.Scanner;

public class majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i=0; i<n ; i++){
            nums[i]=sc.nextInt();
        }
        int count =0;
        int maj=0;
        for(int i=0;i< nums.length;i++){
            if(count == 0){
                maj=nums[i];
                count++;
            }else if(maj == nums[i]){
                count++;
            }else {
                count--;
            }
            }
        System.out.println(maj);
    }
}
