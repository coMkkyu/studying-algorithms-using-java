package _4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	/**
	 *  [����Ʈ�� ����]
	 *  ����Ʈ�� ������ ������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� �����Ѵٴ� ������ ��� �ִ�.
	 *  �� ������ ������ ����Ʈ���� 1845�⿡ �����߰�, ������Ƽ ü������� 1850�⿡ �����ߴ�.
	 *  �ڿ��� n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *  (1 <= n <= 123,456)
	 */
	// n = 123,456 �϶� 2n = 246,912 �̹Ƿ� 246,912+1 ũ���� �迭 ����
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
