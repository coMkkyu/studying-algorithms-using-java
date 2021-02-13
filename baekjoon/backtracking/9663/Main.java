package _9663;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	/**
	 *  [N-Queen]
	 *  ũ�Ⱑ N * N �� ü���� ���� �� N ���� ���� ������ �� ���� ���� �����̴�.
	 *  N �� �־����� ��, ���� ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
		// N ���� ���� ��� ���� ������ �� ����� �� ���� �� �Լ� ����.
		if(row == N) {
			count++;
			return;
		}
		
		// �ݺ����� i�� column�� ��ġ�� �ȴ�.
		for (int i = 0; i < N; i++) {
			chess[row] = i;
			
			// �ش� �࿡ ���� ���� �� �ִ� ��� ���� �࿡ ���ؼ� ���ȣ��.
			if(check(row)) nQueen(row + 1);
		}
	}
	
	public static boolean check(int row) {
		
		for (int i = 0; i < row; i++) {
			// row ���� ���� i���� ���� ��ġ�� ��� (���� ���� ������ ���)
			if(chess[row] == chess[i]) return false;
			// row ��� i ���� ������ �밢���� ��ġ�� ���
			else if (Math.abs(row - i) == Math.abs(chess[row] - chess[i])) return false;
		}
		
		return true;
	}
}
