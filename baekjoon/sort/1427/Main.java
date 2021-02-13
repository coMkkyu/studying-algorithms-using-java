package _1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> numbers = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		
		while (N  != 0) {
			int number = N % 10;
			numbers.add(number);
			N /= 10;
		}
		
		Collections.sort(numbers);
		Collections.reverse(numbers);
		
		for (Integer number : numbers) {
			sb.append(number);
		}
		
		System.out.println(sb);
	}
}
