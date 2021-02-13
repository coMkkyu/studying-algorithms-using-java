package _1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = -1;
		float newSum = 0.0f;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int idx = 0;
		int[] scoreArr = new int[N];
		
		while(st.hasMoreTokens()) {
			scoreArr[idx++] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(scoreArr);
		M = scoreArr[N-1];
		
		for (float value : scoreArr) {
			newSum += value/M * 100;
		}
		
		System.out.print(newSum/N);
	}
	
}
