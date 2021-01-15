package _3053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [�ý� ������]
	 *  �ý� �����п��� �� �� T1(x1,y1), T2(x2,y2) ������ �Ÿ��� ������ ���� ���� �� �ִ�.
	 *  D(T1,T2) = |x1-x2| + |y1-y2|
	 *  �� �� ������ �Ÿ��� ������ ������ ���Ǵ� ��Ŭ���� �����п����� ���ǿ� ����.
	 *  ���� �ý� �����п��� ���� ���Ǵ� ��Ŭ���� �����п��� ���� ���ǿ� ����.
	 *  ��: ��� ���� � ������ �Ÿ��� ������ ������ ����
	 *  ������ R�� �־����� ��, ��Ŭ���� �����п��� ���� ���̿�, �ý� �����п��� ���� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *  ù° �ٿ� ������ R�� �־�����. R�� 10,000���� �۰ų� ���� �ڿ����̴�.
	 *  ������� ������ 0.0001���� ����Ѵ�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ��½� ���� ������ 0.0001 �̹Ƿ� double������ ����
		double R = Double.parseDouble(br.readLine());
		
		// PI ���� Math.PI�� ���
		System.out.println(Math.PI*R*R);
		System.out.println(2*R*R);
	}

}
