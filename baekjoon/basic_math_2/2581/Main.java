package _2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [소수]
	 *  자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
	 *  M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
	 *  소수를 판별하는 방법은 여러가지가 있다.
	 *  1. i=2부터 i <= n-1 까지 n % i == 0인 경우 소수가 아니다.
	 *  2. i=2부터 i <= n/2 까지 n % i == 0인 경우 소수가 아니다.
	 *  3. i=2부터 i <= sqrt(n) 까지 n % i == 0인 경우 소수가 아니다.
	 *  4. 에라토스테네스의 체 알고리즘을 사용한다.
	 *  	=> 2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다.
	 *  	=> 자기 자신을 제외한 2의 배수를 모두 지운다.
	 *  	=> 자기 자신을 제외한 3의 배수를 모두 지운다.
	 *  	=> 자기 자신을 제외한 5의 배술글 모두 지운다.
	 *  	=> 위의 과정을 반복하면 구하는 구간의 모든 소수가 남는다.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = 10001;
		int sum = 0;
		
		for (int i = M; i <= N; i++) {
			boolean isPrime = true;
			// 3번의 방법으로 소수판별 로직을 구현
			for(int n = 2; n*n <= i; n++) {				
				if(i % n == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(i < 2) continue;
			
			if(isPrime) {
				min = min > i ? i : min;
				sum += i;
			}
		}
		
		if(min == 10001) System.out.println(-1);
		else System.out.println(sum+"\n"+min);
	}

}
