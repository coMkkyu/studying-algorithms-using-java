package _1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [�ͷ�]
	 *  �ͷ��� �ٹ��ϴ� �� ������ ��ǥ (x1,y1),(x2,y2)�� �־����� �� �ͷ����� ���������� �Ÿ� r1, r2�� �־����� ��
	 *  ������ ���� �� �ִ� ��ǥ�� ���� ����϶�.
	 *  ��ġ�� ������ ������ ��� -1�� ���
	 *  (-10,000 <= x1,y1,x2,y2 <= 10,000) (1 <= r1,r2 <= 10,000)
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double distance = 0;
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double x1 = Double.parseDouble(st.nextToken());
			double y1 = Double.parseDouble(st.nextToken());
			double r1 = Double.parseDouble(st.nextToken());
			double x2 = Double.parseDouble(st.nextToken());
			double y2 = Double.parseDouble(st.nextToken());
			double r2 = Double.parseDouble(st.nextToken());
			
			distance = getDistance(x1, y1, x2, y2);
			
			if(distance == 0) {
				if(r1 == r2) sb.append(-1).append("\n");
				else sb.append(0).append("\n");
			} else {
				// distance�� �� �������� ������ ũ�� ������ �������� ���ؼ� Ʋ�ȴ� ����
				// ���� ���� �� �����ϴ� ���
				if(distance == r1 + r2 || distance == Math.abs(r1-r2)) sb.append(1).append("\n");
				// �� ���� ���� �����ϴ� ���
				else if(distance < r1 + r2 && distance >= Math.abs(r1-r2)) sb.append(2).append("\n");
				// �� ���� �������ְų� �� ���� �ٸ� �� �ȿ� ������ ������ �ʴ� ���
				else sb.append(0).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}

}
