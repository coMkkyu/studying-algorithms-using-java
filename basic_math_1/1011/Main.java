package _1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/**
	 *  [Fly me to the Alpha Centauri]
	 *  우주선이 이전 작동시기에 k광년을 이동했을 때는 k-1, k, k+1 광년만을 다시 이동할 수 있다.
	 *  예를 들어, 처음 작동시킬 경우 -1, 0, 1 광년을 이론상 이동할 수 있으나 사실상 음수 혹은 0 거리만큼의
	 *  이동은 의미가 없으므로 1 광년을 이동할 수 있으며, 그 다음에는 0, 1, 2 광년을 이동할 수 있는 것이다.
	 *  x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려고 한다. 하지만 y지점에 도착해서도 공간 이동 장치의 안전성을 위해
	 *  y지점에 도착하기 바로 직전의 이동거리는 1 광년으로 하려 한다.
	 *  x지점부터 정확히 y지점으로 이동하는데 필요한 공간 이동 장치 작동 횟수의 최솟값을 구하는 프로그램을 작성하라.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int distance = y - x;
//			int max = (int) Math.round(Math.sqrt(distance));
			double max = Math.round(Math.sqrt(distance));
			
			// 초기에 max 변수를 int 형으로 선언.
			// max * max 연산에서 오버플로우 발생해서 채점결과 오답으로 측정됨.
			if(distance > Math.pow(max, 2)) {
				sb.append((int)max * 2);
			} else {
				sb.append((int)max * 2 - 1);
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
