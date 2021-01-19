package _11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int count = 0;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		hanoi(N, 1, 2, 3);
		
		System.out.println(count);
		System.out.println(sb);
	}
	
	static void hanoi(int n, int from, int stopover, int to) {
		if(n == 1) {
			sb.append(from + " " + to).append("\n");
			count++;
			return;
		}
		
		hanoi(n - 1, from, to, stopover);
		sb.append(from + " " + to).append("\n");
		count++;
		hanoi(n - 1, stopover, from, to);
	}
}
