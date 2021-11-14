package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1427 {
    
	public void go() {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		
		char[] arr = N.toCharArray();
		
        Arrays.sort(arr);
		
		for(int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]);
		}
	}
}
