//  A. Extremely Round

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();


            String s = String.valueOf(n);

            int digits = s.length();
            int firstDigit = s.charAt(0) - '0';

            System.out.println((digits-1) * 9 + firstDigit);

        }
        
    }
}