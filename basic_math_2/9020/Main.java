package _9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [골드바흐의 추측]
	 *  골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다.
	 *  이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드 바흐 파티션이라고 한다.
	 *  2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이
	 *  여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
	 */
	static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		getEratos();
		
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			// 두 소수의 차이가 가장 작은 파티션을 출력해야 하므로
			// j = n / 2 부터 1씩 감소하면서 비교하고 가장먼저 발견된 파티션이 차이가 가장 작은 파티션이므로
			// StringBuilder로 출력형태를 만들어주고 반복문을 빠져나오도록 구현함.
			for (int j = n / 2; j >= 2; j--) {
				if(!prime[j]) {
					if(!prime[n-j]) {
						sb.append(j+" "+(n-j)+"\n");
						break;
					}
				}
			}
		}
		
		System.out.println(sb);
	}
	
	static void getEratos() {
		prime[0] = prime[1] = true;
		
		for (int i = 2; i * i < prime.length; i++) {
			if(prime[i]) continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
