package _1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] board = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			
			for (int j = 0; j < M; j++) {
				board[i][j] = str.charAt(j);
			}
		}
		
		int min = 64;
		
		for (int startRow = 0; startRow < N - 7; startRow++) {
			for (int startCol = 0; startCol < M - 7; startCol++) {
				int value = findMinValue(board, startRow, startCol, N, M);
				min = value > min ? min : value;
			}
		}
		
		System.out.println(min);
	}
	
	static char[][] makeChessBoard(int N, int M, String startColor) {
		char[][] arr = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(i % 2 == 0 ) {
					if(j % 2 == 0) {
						if(startColor.equals("white")) arr[i][j] = 'W';
						else arr[i][j] = 'B';
					} else {
						if(startColor.equals("white")) arr[i][j] = 'B';
						else arr[i][j] = 'W';
					}
				} else {
					if(j % 2 == 0) {
						if(startColor.equals("white")) arr[i][j] = 'B';
						else arr[i][j] = 'W';
					} else {
						if(startColor.equals("white")) arr[i][j] = 'W';
						else arr[i][j] = 'B';
					}
				}
			}
		}
		
		return arr;
	}
	
	static int findMinValue(char[][] board, int row, int col, int N, int M) {
		char[][] white = makeChessBoard(N, M, "white");
		char[][] black = makeChessBoard(N, M, "black");
		int diffWhite = 0;
		int diffBlack = 0;
		
		for (int i = row; i < row + 8; i++) {
			for (int j = col; j < col + 8; j++) {
				if(board[i][j] != white[i-row][j-col]) diffBlack++;
				if(board[i][j] != black[i-row][j-col]) diffWhite++;
			}
		}
		
		return diffBlack > diffWhite ? diffWhite : diffBlack;
	}
}
