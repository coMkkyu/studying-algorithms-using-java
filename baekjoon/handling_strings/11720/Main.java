package _11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for (byte value : br.readLine().getBytes()) {
			sum += (value - 48);
		}
		
		System.out.println(sum);
	}

}
