package _2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [�Ҽ�]
	 *  �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
	 *  M�� N�� 10,000������ �ڿ����̸�, M�� N���� �۰ų� ����.
	 *  �Ҽ��� �Ǻ��ϴ� ����� ���������� �ִ�.
	 *  1. i=2���� i <= n-1 ���� n % i == 0�� ��� �Ҽ��� �ƴϴ�.
	 *  2. i=2���� i <= n/2 ���� n % i == 0�� ��� �Ҽ��� �ƴϴ�.
	 *  3. i=2���� i <= sqrt(n) ���� n % i == 0�� ��� �Ҽ��� �ƴϴ�.
	 *  4. �����佺�׳׽��� ü �˰����� ����Ѵ�.
	 *  	=> 2���� �Ҽ��� ���ϰ��� �ϴ� ������ ��� ���� �����Ѵ�.
	 *  	=> �ڱ� �ڽ��� ������ 2�� ����� ��� �����.
	 *  	=> �ڱ� �ڽ��� ������ 3�� ����� ��� �����.
	 *  	=> �ڱ� �ڽ��� ������ 5�� ����� ��� �����.
	 *  	=> ���� ������ �ݺ��ϸ� ���ϴ� ������ ��� �Ҽ��� ���´�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = 10001;
		int sum = 0;
		
		for (int i = M; i <= N; i++) {
			boolean isPrime = true;
			// 3���� ������� �Ҽ��Ǻ� ������ ����
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
