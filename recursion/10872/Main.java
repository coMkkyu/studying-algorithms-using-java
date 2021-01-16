package _10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [팩토리얼]
	 *  0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
	 *  첫째 줄에 정수 N(0 <= N <= 12)가 주어진다.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(n));
	}
	
	static int factorial(int n) {
		if(n == 0) return 1;
		// n!의 경우 (n-1)!에 n을 곱한 값과 같다.
		// 따라서 다음과 같이 재귀로 구현할 수 있다.
		else return n * factorial(n-1);
	}

}
