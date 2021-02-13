package _2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 1;
		String resultStr;
		int[] numCountArr = new int[10];
		
		for (int i = 0; i < 3; i++) {
			result *= Integer.parseInt(br.readLine());
		}
		
		resultStr = Integer.toString(result);
		
		for (int i = 0; i < resultStr.length(); i++) {
			numCountArr[Character.getNumericValue(resultStr.charAt(i))]++;
		}
		
		for (int count : numCountArr) {
			System.out.println(count);
		}
	}

}
