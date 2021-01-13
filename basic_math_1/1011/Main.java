package _1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	/**
	 *  [Fly me to the Alpha Centauri]
	 *  ���ּ��� ���� �۵��ñ⿡ k������ �̵����� ���� k-1, k, k+1 ���⸸�� �ٽ� �̵��� �� �ִ�.
	 *  ���� ���, ó�� �۵���ų ��� -1, 0, 1 ������ �̷л� �̵��� �� ������ ��ǻ� ���� Ȥ�� 0 �Ÿ���ŭ��
	 *  �̵��� �ǹ̰� �����Ƿ� 1 ������ �̵��� �� ������, �� �������� 0, 1, 2 ������ �̵��� �� �ִ� ���̴�.
	 *  x�������� y������ ���� �ּ����� �۵� Ƚ���� �̵��Ϸ��� �Ѵ�. ������ y������ �����ؼ��� ���� �̵� ��ġ�� �������� ����
	 *  y������ �����ϱ� �ٷ� ������ �̵��Ÿ��� 1 �������� �Ϸ� �Ѵ�.
	 *  x�������� ��Ȯ�� y�������� �̵��ϴµ� �ʿ��� ���� �̵� ��ġ �۵� Ƚ���� �ּڰ��� ���ϴ� ���α׷��� �ۼ��϶�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int distance = y - x;
//			int max = (int) Math.round(Math.sqrt(distance));
			double max = Math.round(Math.sqrt(distance));
			
			// �ʱ⿡ max ������ int ������ ����.
			// max * max ���꿡�� �����÷ο� �߻��ؼ� ä����� �������� ������.
			if(distance > Math.pow(max, 2)) {
				sb.append((int)max * 2);
			} else {
				sb.append((int)max * 2 - 1);
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
