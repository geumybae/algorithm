package baekjoon;

import java.math.*;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Q10757 {

    public void go() throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
      BigInteger big1 = new BigInteger(stk.nextToken()); 
      BigInteger big2 = new BigInteger(stk.nextToken());
        
      System.out.println(big1.add(big2)); 
    }
   
}