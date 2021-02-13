package _10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [�Ǻ���ġ �� 5]
	 *  �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�.
	 *  �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
	 *  n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
		
		// n = 2 ���ʹ� fibonacci(n)�� ���� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
		return fibonacci(n-2) + fibonacci(n-1);
	}

}
