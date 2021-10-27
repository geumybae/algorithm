package baekjoon;

import java.util.*;
import java.io.*;

public class Q10250 {
    public void go() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<String> lst = new ArrayList<>();
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
    
            int Y = N;
            int X = N/H;
    
            if(N%H != 0) ++X;
            if(N > H) Y = N - (H*(X-1));

            String room = Integer.toString(Y) + (X < 10 ? "0" : "") + Integer.toString(X); 

            lst.add(room);
        }

        for(String room : lst){
            System.out.println(room);
        }
    }
}
