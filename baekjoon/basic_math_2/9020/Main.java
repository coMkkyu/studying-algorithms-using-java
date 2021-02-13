package _9020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [�������� ����]
	 *  �������� ������ ������ �������� ���ذ� ������, 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִٴ� ���̴�.
	 *  �̷��� ���� ������ ����� �Ѵ�. ��, ¦���� �� �Ҽ��� ������ ��Ÿ���� ǥ���� �� ���� ��� ���� ��Ƽ���̶�� �Ѵ�.
	 *  2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ������ n�� ������ ��Ƽ����
	 *  ���� ������ ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.
	 */
	static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		getEratos();
		
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			// �� �Ҽ��� ���̰� ���� ���� ��Ƽ���� ����ؾ� �ϹǷ�
			// j = n / 2 ���� 1�� �����ϸ鼭 ���ϰ� ������� �߰ߵ� ��Ƽ���� ���̰� ���� ���� ��Ƽ���̹Ƿ�
			// StringBuilder�� ������¸� ������ְ� �ݺ����� ������������ ������.
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
