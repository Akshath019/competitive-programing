//  A. Walking Master

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x1,y1,x2,y2;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            if(y1 > y2 || x2-x1 > y2-y1){
                System.out.println("-1");
            }else{
                int ans = (x1 - x2 + 2*(y2 - y1));
                System.out.println(ans);
            }
        }
        
    }
}