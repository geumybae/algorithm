package baekjoon;

import java.util.*;

public class Q10872 {
    public void go() {
        Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.close();
		
		int sum = factorial(n);
		System.out.println(sum);
    }

    public static int factorial(int n) {
		if(n <= 1) return 1;	// 재귀 종료조건
		return n * factorial(n - 1);		
	}
}
