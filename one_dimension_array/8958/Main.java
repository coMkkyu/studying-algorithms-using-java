package _8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br =	new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] scoreArr = new int[N];
		
		for (int i = 0; i < scoreArr.length; i++) {
			int score = 1;
			int totalScore = 0;
			String result = br.readLine();
			for (int j = 0; j < result.length(); j++) {
				if(result.charAt(j) == 'X') {
					totalScore += 0;
				} else {
					if(j >= 1) {
						char charAtPos = result.charAt(j);
						char charAtPrevPos = result.charAt(j-1);
						if(charAtPos == charAtPrevPos) {
							score++;
						} else {
							score = 1;
						}
					}
					totalScore += score;
				}
			}
			scoreArr[i] = totalScore;
		}
		
		for (int sum : scoreArr) {
			System.out.println(sum);
		}
	}

}