package _1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [터렛]
	 *  터렛에 근무하는 두 직원의 좌표 (x1,y1),(x2,y2)가 주어지고 각 터렛에서 마린까지의 거리 r1, r2가 주어졌을 때
	 *  마란이 있을 수 있는 좌표의 수를 출력하라.
	 *  위치의 개수가 무한일 경우 -1을 출력
	 *  (-10,000 <= x1,y1,x2,y2 <= 10,000) (1 <= r1,r2 <= 10,000)
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double distance = 0;
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double r1 = Double.parseDouble(st.nextToken());
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double r2 = Double.parseDouble(st.nextToken());
			
			distance = getDistance(x1, y1, x2, y2);
			
			if(distance == 0) {
				if(r1 == r2) sb.append(-1).append("\n");
				else sb.append(0).append("\n");
			} else {
				// distance와 두 반지름의 차이의 크기 조건을 생각하지 못해서 틀렸던 문제
				// 원이 외접 및 내접하는 경우
				if(distance == r1 + r2 || distance == Math.abs(r1-r2)) sb.append(1).append("\n");
				// 두 원이 서로 교차하는 경우
				else if(distance < r1 + r2 && distance >= Math.abs(r1-r2)) sb.append(2).append("\n");
				// 두 원이 떨어져있거나 한 원이 다른 원 안에 있지만 만나지 않는 경우
				else sb.append(0).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}

}
