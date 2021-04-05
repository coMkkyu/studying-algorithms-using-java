package _1541;

/**
 * @author COMKKYU
 * @date 2021. 4. 5
 * 
 * 그리디 - 잃어버린 괄호
 * https://www.acmicpc.net/problem/1541
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		// 초기 상태 여부 확인을 위한 값
		int sum = Integer.MAX_VALUE;
		// -을 기준으로 토큰화
		StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
		
		while (sub.hasMoreTokens()) {
			int temp = 0;
			// +을 기준으로 토큰화
			StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
			
			// 덧셈으로 나뉜 토큰들을 모두 더한다.
			while (add.hasMoreTokens()) {
				temp += Integer.parseInt(add.nextToken());
			}
			
			// 첫 번째 토큰의 경우 temp 값이 첫 번째 수가 된다.
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		
		System.out.println(sum);
		
	}

}
