package _2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 * 달팽이가 높이가 V미터인 나무 막대를 올라갈 것이다.
	 * 낮에 A미터를 올라갈 수 있지만 밤에 잠을 자는 동안 B미터 미끄러진다. (정상에 도달할 경우 미끄러지지 않는다)
	 * 달팽이가 나무 막대를 모두 올라가려면 며칠이 걸리는지 구하시오.
	 * 첫째 줄에 세 정수 A, B, V가 공백으로 구분뒤어서 주어진다. (1<=B<A<=V<=1,000,000,000)
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int day = 0;
		
		day = (V - B) / (A - B);
		
		if((V - B) % (A - B) != 0) {
			day++;
		}
		
		System.out.println(day);
	}

}
