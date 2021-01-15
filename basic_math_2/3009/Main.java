package _3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 * 	[�� ��° ��]
	 *  �� ���� �־����� ��, �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ���α׷��� �ۼ��Ͻÿ�.
	 *  �� ���� ��ǥ�� �� �ٿ� �ϳ��� �־�����. ��ǥ�� 1���� ũ�ų� ����, 1000���� �۰ų� ���� �����̴�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] x = new int[3];
		int[] y = new int[3];
		int result_x = 0;
		int result_y = 0;
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		/**
		 *  ��� �����ϱ� ���ؼ��� x�� ������ ������ 2��, y�� ������ ������ 2���� �ʿ�
		 *  ���� ������ �Է°����� �ϳ��� x�� �ϳ��� y�� �̷���� ��ǥ (x,y)�� �ȴ�.
		 */
		if(x[0] != x[1]) result_x = x[0] != x[2] ? x[0] : x[1];
		else result_x = x[2];

		
		if(y[0] != y[1]) result_y = y[0] != y[2] ? y[0] : y[1];
		else result_y = y[2];
		
		System.out.println(result_x + " " + result_y);
	}

}
