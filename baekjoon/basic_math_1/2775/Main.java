package _2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  ��� �ݻ�ȸ�� �����ϴ� ���� �����ϴ� ����� �̹� ��ȸ�� �γ�ȸ���� �ǰ� �;� �� ���� ������� �ҷ� ��� �ݻ�ȸ�� �����Ϸ��� �Ѵ�.
	 *  �� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�, ��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ
	 *  ������� ������ ��ƾ� �Ѵ١� �� ��� ������ �� ��Ű�� ���;� �Ѵ�.
	 *  ����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��, 
	 *  �־����� ���� ���� k�� n�� ���� k���� nȣ���� �� ���� ��� �ִ��� ����϶�. 
	 *  ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(Integer.toString(cal(k, n))).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static int cal(int k, int n) {
		if (n == 1) return 1;
		if (k == 0) return n;
		
		return cal(k, n-1) + cal(k-1, n);
	}

}
