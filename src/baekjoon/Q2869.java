package baekjoon;

import java.util.*;
import java.io.*;

public class Q2869 {
    public void go() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken()); 
		int B = Integer.parseInt(st.nextToken()); 
		int V = Integer.parseInt(st.nextToken()); 

        // https://st-lab.tistory.com/75

        int day = (V - B) / (A - B);
 
        if( (V - B) % (A - B) != 0 ) {
            day++;
        }
		System.out.println(day);
    }
}
