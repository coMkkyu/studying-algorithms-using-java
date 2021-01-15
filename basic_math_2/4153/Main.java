package _4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 * 	[�����ﰢ��]
	 *  ���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�.
	 *  �־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.
	 *  �Է��� �������� �׽�Ʈ���̽��� �־����� �������ٿ��� 0 0 0�� �Էµȴ�.
	 *  �� �׽�Ʈ���̽��� ��� 30,000���� ���� ���� ������ �־�����, �� �Է��� ���� ���̸� �ǹ��Ѵ�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int ausar = Integer.parseInt(st.nextToken());
			int auset = Integer.parseInt(st.nextToken());
			int heru = Integer.parseInt(st.nextToken());
			
			if(ausar == 0 && auset == 0 && heru == 0) break;
			
			// �������� �� ���Ǳ��̰� ���� ������� �־����ٴ� ������ ���⶧���� 3���� ���ǿ� ���ؼ�
			// ������ ��쿡 ���� ��Ÿ����� ������ �����ؾ��Ѵ�.
			// �ܼ��� heru�� �������� ����ؼ� �����ߴٰ� Ʋ�� ����...
			if((ausar * ausar) + (auset * auset) == (heru * heru))
				sb.append("right").append("\n");
			else if((auset * auset) + (heru * heru) == (ausar * ausar))
				sb.append("right").append("\n");
			else if((heru * heru) + (ausar * ausar) == (auset * auset))
				sb.append("right").append("\n");
			else
				sb.append("wrong").append("\n");
		}
		
		System.out.println(sb);
	}

}
