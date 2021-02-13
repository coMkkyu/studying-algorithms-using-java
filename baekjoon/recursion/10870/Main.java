package _10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [피보나치 수 5]
	 *  피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
	 *  그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
	 *  n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
	 *  (0 <= n <= 20)
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n));
	}
	
	static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		// n = 2 부터는 fibonacci(n)의 값은 바로 앞 두 피보나치 수의 합이 된다.
		return fibonacci(n-2) + fibonacci(n-1);
	}

}
