package _2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(numbers);
		
		for (int number : numbers) {
			sb.append(number).append("\n");
		}
		
		System.out.println(sb);
	}
}
