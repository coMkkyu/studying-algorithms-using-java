package _1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [���簢������ Ż��]
	 *  �Ѽ��� ���� (x,y)�� �ִ�. ���簢�� ���� �Ʒ� �������� (0,0)�� �ְ�, ������ �� �������� (w,h)�� �ִ�.
	 *  ���簢�� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		// (h - y vs y) vs (w - x vs w) y�� �ּҰŸ��� x�� �ּҰŸ��� �� ���� ������ ����ϸ� �ȴ�.
		System.out.println(Math.min(Math.min(h-y, y), Math.min(w-x, x)));
	}

}
