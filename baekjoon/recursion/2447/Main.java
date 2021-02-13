package _2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], ' ');			
		}
				
		makeStarPattern(0, 0, N);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	static void makeStarPattern(int row, int col, int n) {
		
		if(n == 1) {
			arr[row][col] = '*';
			return;
		}
		
		int block = n / 3;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) continue;
				makeStarPattern(row + block * i, col + block * j, block);
			}
		}
	}
}
