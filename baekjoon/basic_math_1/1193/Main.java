package _1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * 무한이 큰 배열에 다음과 같이 분수들이 적혀있다.
	 * 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> ... 과 같은 지그재그 순서로 차례대로
	 * 1번, 2번, 3번, 4번, 5번, ... 분수라고 하자.
	 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
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
