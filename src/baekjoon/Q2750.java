package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {
    public void go(){
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] arr = new int[len];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        for(int i=0; i<len; i++){
            sb.append(arr[i]+"\n");
        }

        System.out.println(sb.toString());

    }
}
