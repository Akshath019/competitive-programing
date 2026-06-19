//  A. Grasshopper on a Line

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();


        while(t-- > 0){
            int x = sc.nextInt();
            int k = sc.nextInt();




            if (x % k != 0) {
                System.out.println(1);
                System.out.println(x);
            } else {
                System.out.println(2);
                System.out.println(1 + " " + (x - 1));
            }

        }
        
    }
}