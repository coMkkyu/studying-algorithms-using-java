package _1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * ������ ū �迭�� ������ ���� �м����� �����ִ�.
	 * 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> ... �� ���� ������� ������ ���ʴ��
	 * 1��, 2��, 3��, 4��, 5��, ... �м���� ����.
	 * X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int group = 0;
		int count = 0;
		
		while(count < X) {
			group++;
			count = group * (group + 1) / 2;
		}
		
		if(group % 2 == 0) {
			int left = group - (count - X);
			int right = group + 1 - left;
			System.out.println(left+"/"+right);
		} else {
			int left = count - X + 1;
			int right = group + 1 - left;
			System.out.println(left+"/"+right);
		}
	}

}
