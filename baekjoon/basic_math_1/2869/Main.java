package _2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 * �����̰� ���̰� V������ ���� ���븦 �ö� ���̴�.
	 * ���� A���͸� �ö� �� ������ �㿡 ���� �ڴ� ���� B���� �̲�������. (���� ������ ��� �̲������� �ʴ´�)
	 * �����̰� ���� ���븦 ��� �ö󰡷��� ��ĥ�� �ɸ����� ���Ͻÿ�.
	 * ù° �ٿ� �� ���� A, B, V�� �������� ���еھ �־�����. (1<=B<A<=V<=1,000,000,000)
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int day = 0;
		
		day = (V - B) / (A - B);
		
		if((V - B) % (A - B) != 0) {
			day++;
		}
		
		System.out.println(day);
	}

}
