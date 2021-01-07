package _1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		printHansuCount(X);
	}
	
	public static void printHansuCount(int n) {
		int count = 0;
		int[] tolerance = new int[3];
		int idx;
		
		for (int i = 1; i <= n; i++) {
			if(i > 0 && i < 100) {
				count = i;
			} else if(i == 1000) {
				break;
			} else {
				idx = 0;
				int temp = i;
				while(temp != 0) {
					tolerance[idx++] = temp % 10;
					temp /= 10;
				}
				if(tolerance[0] - tolerance[1] == tolerance[1] - tolerance[2]) {
					count++;
				}
			}
		}
		
		System.out.print(count);
	}
}
