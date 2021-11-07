package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10989 {
    
    public void go() throws IOException{
        //https://zoonvivor.tistory.com/43 참고

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        int[] arr = new int[100001];

        //arr 해당 값 + 1씩
        for(int i=0; i<cnt; i++){
            int target = Integer.parseInt(br.readLine());
            arr[target] ++;
        }

        int check = 0;
        for(int i=0; i<arr.length; i++){
            
            while(arr[i] > 0){
                bw.write(Integer.toString(i) + "\n");
                ++check;
                --arr[i];
            }

            if(check == cnt) break;
        }

        br.close();
        bw.close();
    }
}
