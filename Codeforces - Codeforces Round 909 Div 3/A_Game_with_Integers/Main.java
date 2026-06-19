//  A. Game with Integers

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            int num = sc.nextInt();

            if((num % 3) == 0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}