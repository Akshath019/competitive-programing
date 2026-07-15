//  B. Comparison String

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int cnt = 1 ;
            int l = 1;



            for(int i = 1;  i < n ; i++){
                if(s.charAt(i-1) == s.charAt(i)){
                    cnt++;
                }else{
                    l = Math.max(l , cnt);
                    cnt = 1;
                }
            }
            l = Math.max(l , cnt);
            System.out.println(l+1);
        }
        
    }
}