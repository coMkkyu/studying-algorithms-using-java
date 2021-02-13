package _11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [좌표 정렬하기]
	 *  2 차원 평면 위의 점 N 개가 주어진다. 좌표를 x 좌표가 증가하는 순으로, x 좌표가 같으면 y 좌표가 증가하는 순서로
	 *  정렬한 다음 출력하는 프로그램을 작성하시오. (1 <= N <= 100,000), (-100,000 <= x,y <= 100,000)
	 *  좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
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
		 *  Arrays.sort() 자체는 2 차원 배열의 정렬을 할 수 없다.
		 *  따라서 람다식을 사용하여 Arrays.sort() 를 확장할 수 있어야한다.
		 *  (매개변수 1, ...) -> { 함수; }
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
