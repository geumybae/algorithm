package baekjoon;

import java.util.*;

public class Q1193 {
    
    public void go(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = 0;
        int ds=0;
        int dd=0;

        for(int i = 1; i < 10000; i++) {
            if(num > tmp && tmp+i>=num) {
                if(i % 2 == 0) {
                    ds = i + 1 - (num - tmp);
                    dd = (num - tmp);    
                }
                else {
                    ds = (num - tmp);
                    dd = i + 1 - (num - tmp);
                }
                break;
            }
            tmp+=i;
        }
        System.out.print(dd+"/"+ds);
    }
}
