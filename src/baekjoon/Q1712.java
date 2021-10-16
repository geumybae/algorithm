package baekjoon;

import java.util.*;

public class Q1712 {
    
    public void go() {
        Scanner sc = new Scanner(System.in); 
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int C = sc.nextInt(); 
        int income = C - B; 
        if(income <= 0) {
            System.out.println(-1); 
        } else { 
            System.out.println(A/income + 1); 
        }

    }

}
