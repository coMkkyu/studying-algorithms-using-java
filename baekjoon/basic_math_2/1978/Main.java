package _1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [�Ҽ� ã��]
	 *  �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *  N�� 100����. N���� ���� 1,000 ������ �ڿ����̴�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine()); // N�� �Է¹����� ������� ����.
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			boolean isPrime = true;
			
			if(num < 2) continue;
			if(num == 2) {
				count++;
				continue;
			}
			
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) count++;
		}
		
		System.out.println(count);
	}

}
