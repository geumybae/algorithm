package baekjoon;

import java.util.*;

public class Q2292 {

    public void go() {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
		int layer = 1;
		int num = 0; 
		int total = 1; 
		
		while (true) {
			if (n <= total)
				break;
			else {
				num += 6;
				total+=num;
				layer++;
			}
		}
		System.out.println(layer);
    }
}
