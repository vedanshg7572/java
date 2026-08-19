import java.util.*;
public class classs {
    public static void main(String[] args) {
        int total = 8;
        ArrayList<Integer> ans =  new ArrayList<>();
        int[] coin = {2,3,5};
        f(coin,total,ans);
    }
    static void f(int[] coin,int total,ArrayList<Integer> ans){
        if(total==0){
            System.out.println(ans);
            return ;
        }
        if(total<0) return ;
        for (int i = 0;i<coin.length;i++){
            ans.add(coin[i]);
            f(coin,total-coin[i],ans);
        }
    }
}