package _1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [소수 찾기]
	 *  주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	 *  N은 100이하. N개의 수는 1,000 이하의 자연수이다.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine()); // N을 입력받지만 사용하지 않음.
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			boolean isPrime = true;
			
			if(num < 2) continue;
			if(num == 2) {
				count++;
				continue;
			}
			
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) count++;
		}
		
		System.out.println(count);
	}

}
