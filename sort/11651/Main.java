package _11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] coordinates = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			coordinates[i][0] = Integer.parseInt(st.nextToken());
			coordinates[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(coordinates, (c1, c2) -> {
			if (c1[1] == c2[1]) return c1[0] - c2[0];
			else return c1[1] - c2[1];
		});
		
		for (int[] is : coordinates) {
			sb.append(is[0]).append(" ").append(is[1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
