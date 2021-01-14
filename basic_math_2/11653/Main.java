package _11653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [소인수분해]
	 *  정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.(1 <= N <= 10,000,000)
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 2; i * i <= N; i++) {
			while(N % i == 0) {
				sb.append(i+"\n");
				N /= i;
			}
		}
		
		if(N != 1) sb.append(N+"\n");
		
		System.out.println(sb);
	}

}
