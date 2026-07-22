//  B. NIT Destroys the Universe

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0 ){
            int n = sc.nextInt();

            int[] arr = new int[n];
            int ans = 0;

            int flag = 0;
            for(int i = 0;  i < n ; i++){
               int ele = sc.nextInt();
               if(ele != 0){
                   flag = 1;
               }
               arr[i] = ele;

            }
            if(flag == 0){
                System.out.println("0");
            }else{
                int left = 0;
                int right = n-1;

                while(arr[left]==0){
                    left++;
                }

                while(arr[right] == 0){
                    right--;
                }
                boolean found_zero = false;
                for(int i = left ; i <= right ;i++){
                    if(arr[i] == 0){
                        found_zero = true;
                    }
                }

                if(found_zero == false){
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }

            }
        }
        
    }
}