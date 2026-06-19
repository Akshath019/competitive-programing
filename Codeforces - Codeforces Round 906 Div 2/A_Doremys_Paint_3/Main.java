//  A. Doremy's Paint 3

import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0 ){
            int n = sc.nextInt();

            HashMap<Integer , Integer> map = new HashMap<>();

            for(int i = 0 ; i < n ; i++){
                int x = sc.nextInt();
                map.put(x , map.getOrDefault(x , 0)+1);
            }

            if(map.size() == 1){
                System.out.println("Yes");
            }

            else if(map.size() == 2){
                int[] cnt = new int[2];
                int idx = 0;

                for(int v : map.values()){
                    cnt[idx++] = v;
                }

                System.out.println(
                        Math.abs(cnt[0] - cnt[1]) <= 1 ? "Yes" : "No"
                );
            }else{
                System.out.println("No");
            }


        }
        
    }
}