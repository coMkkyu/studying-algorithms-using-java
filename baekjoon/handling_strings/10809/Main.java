package _10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] check = new int[26];
		int pos = 0;
		StringJoiner sj = new StringJoiner(" ");
		String result;
		
		for (int i = 0; i < check.length; i++) {
			check[i] = -1;
		}
		// 97~122 ASCII code -> a~z
		for (byte b : br.readLine().getBytes()) {
			int idx = b - 97;
			if(check[idx] == -1) {
				check[idx] = pos++;
				continue;
			}
			pos++;
		}
		
		for (int i : check) {
			sj.add(Integer.toString(i));
		}
		
		result = sj.toString();
		
		System.out.println(result);
	}

}
