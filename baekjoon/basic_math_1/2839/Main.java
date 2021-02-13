package _2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 *  [설탕 배달]
	 *  설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
	 *  최대한 적은 봉지를 들고 배달하려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야할 때,
	 *  3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
	 *  정확하게 N킬로그램을 배달해야할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
	 *  (만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.)
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int numOf5kg = 0;
		int numOf3kg = 0;
		
		while(N % 5 != 0 && N >= 0) {
			N -= 3;
			numOf3kg++;
		}
		
		if(N < 0) {
			System.out.println(-1);
		} else {
			numOf5kg = N / 5;
			System.out.println(numOf5kg + numOf3kg);
		}
	}

}
