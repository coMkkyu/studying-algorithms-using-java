package _9663;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	/**
	 *  [N-Queen]
	 *  크기가 N * N 인 체스판 위에 퀸 N 개를 서로 공격할 수 없게 놓는 문제이다.
	 *  N 이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
	 *  (1 <= N <= 15)
	 */
	public static int N;
	public static int count = 0;
	public static int[] chess;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		chess = new int[N];
		
		nQueen(0);
		
		System.out.println(count);
	}
	
	public static void nQueen(int row) {
		// N 개의 퀸을 모두 놓은 상태일 때 경우의 수 증가 및 함수 종료.
		if(row == N) {
			count++;
			return;
		}
		
		// 반복문의 i는 column의 위치가 된다.
		for (int i = 0; i < N; i++) {
			chess[row] = i;
			
			// 해당 행에 퀸을 놓을 수 있는 경우 다음 행에 대해서 재귀호출.
			if(check(row)) nQueen(row + 1);
		}
	}
	
	public static boolean check(int row) {
		
		for (int i = 0; i < row; i++) {
			// row 행의 열과 i행의 열이 일치할 경우 (같은 열에 존재할 경우)
			if(chess[row] == chess[i]) return false;
			// row 행과 i 행의 열값이 대각선에 위치할 경우
			else if (Math.abs(row - i) == Math.abs(chess[row] - chess[i])) return false;
		}
		
		return true;
	}
}
