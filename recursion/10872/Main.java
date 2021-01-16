package _10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [���丮��]
	 *  0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *  ù° �ٿ� ���� N(0 <= N <= 12)�� �־�����.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(n));
	}
	
	static int factorial(int n) {
		if(n == 0) return 1;
		// n!�� ��� (n-1)!�� n�� ���� ���� ����.
		// ���� ������ ���� ��ͷ� ������ �� �ִ�.
		else return n * factorial(n-1);
	}

}
