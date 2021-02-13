package _3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 * 	[네 번째 점]
	 *  세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
	 *  세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] x = new int[3];
		int[] y = new int[3];
		int result_x = 0;
		int result_y = 0;
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		/**
		 *  축과 평행하기 위해서는 x가 동일한 순서쌍 2쌍, y가 동일한 순서쌍 2쌍이 필요
		 *  따라서 정답은 입력값에서 하나인 x와 하나인 y로 이루어진 좌표 (x,y)가 된다.
		 */
		if(x[0] != x[1]) result_x = x[0] != x[2] ? x[0] : x[1];
		else result_x = x[2];

		
		if(y[0] != y[1]) result_y = y[0] != y[2] ? y[0] : y[1];
		else result_y = y[2];
		
		System.out.println(result_x + " " + result_y);
	}

}
