package _2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [���� ���]
	 *  �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
	 *  �ִ��� ���� ������ ��� ����Ϸ��� �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ��� ��,
	 *  3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
	 *  ��Ȯ�ϰ� Nų�α׷��� ����ؾ��� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *  (����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.)
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int numOf5kg = 0;
		int numOf3kg = 0;
		
		while(N % 5 != 0 && N >= 0) {
			N -= 3;
			numOf3kg++;
		}
		
		if(N < 0) {
			System.out.println(-1);
		} else {
			numOf5kg = N / 5;
			System.out.println(numOf5kg + numOf3kg);
		}
	}

}
