package _4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		float[] ratios = new float[C];
		
		for (int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int[] scores = new int[N];
			int idx = 0;
			int sum = 0;
			int count = 0;
			float avg = 0.0f;
			
			while(st.hasMoreTokens()) {
				scores[idx] = Integer.parseInt(st.nextToken());
				sum += scores[idx++];
			}
			
			avg = (float)sum / N;
			
			for (int score : scores) {
				if(score > avg) count++;
			}
			
			ratios[i] = (float)count / N * 100;
		}
		
		for (float ratio : ratios) {
			System.out.println(String.format("%.3f", ratio) + "%");
		}
	}

}
