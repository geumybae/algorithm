package baekjoon;

import java.io.InputStream;
import java.util.*;

//최소,최대
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

public class Q10818 {
    public void go() {
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if(x >= max) max = x;
			if(x <= min) min = x;
		}
		System.out.println(min + " " + max);
    }
}
