package _11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [��ǥ �����ϱ�]
	 *  2 ���� ��� ���� �� N ���� �־�����. ��ǥ�� x ��ǥ�� �����ϴ� ������, x ��ǥ�� ������ y ��ǥ�� �����ϴ� ������
	 *  ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (1 <= N <= 100,000), (-100,000 <= x,y <= 100,000)
	 *  ��ǥ�� �׻� �����̰�, ��ġ�� ���� �� ���� ����.
	 */
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
		
		/*
		 *  Arrays.sort() ��ü�� 2 ���� �迭�� ������ �� �� ����.
		 *  ���� ���ٽ��� ����Ͽ� Arrays.sort() �� Ȯ���� �� �־���Ѵ�.
		 *  (�Ű����� 1, ...) -> { �Լ�; }
		 */
		Arrays.sort(coordinates, (c1, c2) -> {
			if(c1[0] == c2[0]) return c1[1] - c2[1];
			else return c1[0] - c2[0];
		});
		
		for (int[] is : coordinates) {
			sb.append(is[0]).append(" ").append(is[1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
