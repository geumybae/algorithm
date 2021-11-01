package baekjoon;

import java.util.Scanner;

public class Q2839 {
    public void go(){
        Scanner sc = new Scanner(System.in);

        //http://www.blognawa.com/i/27073/7318383/https://infodon.tistory.com/38
        //참고
		
		int num = sc.nextInt();
		
		int N = 0;
		
		while(true){
            if(num%5 == 0) {
                N += num/5;
                break;
            }
            
            num -= 3;
            N++;
            
            if(num < 0) {
                N = -1;
                break;
            }
        }
		
        System.out.println(N);

    }
}
