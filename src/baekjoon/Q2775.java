package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2775 {

    public void go() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringBuilder ts = new StringBuilder();
        
        for(int i=0; i<T; i++){
            
            
            int K = Integer.parseInt(br.readLine());    //floor
            int H = Integer.parseInt(br.readLine());    //room

            int[][] arr = new int[K+1][H];

            for(int k=0; k<K+1; k++){
                
                for(int h=0; h<H; h++){
                    int val;

                    //1호
                    if(h == 0){
                        val = 1;
                    }
                    //0층
                    else if(k == 0){
                        val = h+1;    
                    }
                    else{
                        val = arr[k-1][h] + arr[k][h-1];
                    }

                    arr[k][h] = val;
                }
            }
            sb.append(arr[K][H-1]+"\n");
        }
        System.out.println(sb.toString());
    }
    
}
