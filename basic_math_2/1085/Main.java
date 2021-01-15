package _1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [직사각형에서 탈출]
	 *  한수는 지금 (x,y)에 있다. 직사각형 왼쪽 아래 꼭짓점은 (0,0)에 있고, 오른쪽 위 꼭짓점은 (w,h)에 있다.
	 *  직사각형 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		// (h - y vs y) vs (w - x vs w) y축 최소거리와 x축 최소거리중 더 작은 값으로 출력하면 된다.
		System.out.println(Math.min(Math.min(h-y, y), Math.min(w-x, x)));
	}

}
