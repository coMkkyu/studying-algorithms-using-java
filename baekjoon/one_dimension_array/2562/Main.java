package _2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int max = -1;
		int[] inputArr = new int[9];
		
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = Integer.parseInt(br.readLine());
			if(inputArr[i] > max) {
				max = inputArr[i];
				count = i + 1;
			}
		}

		System.out.print(max + "\n" + count);
	}

}
