package 字符串;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int n = sc.nextInt();
            char [] arr = sc.next().toCharArray();
            int [] right=  new int[130];
            int [] left = new int[130];
            int res=0;
            for(int i=0;i<arr.length;i++){
                right[arr[i]-' ']++;
                if(right[arr[i]-' ']==1){
                    res++;
                }
            }
            int tmp = res;
            for(int i=0;i<arr.length;i++){
                int idx = arr[i]-' ';
                right[idx]--;
                left[idx]++;
                if(right[idx]==0){
                    tmp--;
                }
                if(left[idx]==1){
                    tmp++;
                }
                res = Math.max(res,tmp);
            }
            System.out.println(res);
        }

    }
}
