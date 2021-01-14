package _4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	/**
	 *  [베르트랑 공준]
	 *  베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
	 *  이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
	 *  자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
	 *  (1 <= n <= 123,456)
	 */
	// n = 123,456 일때 2n = 246,912 이므로 246,912+1 크기의 배열 생성
	static boolean[] prime = new boolean[246913];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		getEratos();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			
			if(n == 0) break;
			
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) count++;
			}
			
			sb.append(count+"\n");
		}
		
		System.out.println(sb);
	}
	
	static void getEratos() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i * i < prime.length; i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
