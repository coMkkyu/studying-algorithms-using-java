package _1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			boolean[] alphabet = new boolean[26];
			byte[] word = br.readLine().getBytes();
			boolean check = false;
			byte prev = '0';
			
			for (int j = 0; j < word.length; j++) {
				byte now = word[j];
				// 이전 문자와 동일한 문자가 연속적으로 나온건지 먼저 확인
				if(prev != now) {
					// ASCII CODE 97(a) ~ 122(z)
					if(!alphabet[now - 97]) {
						alphabet[now - 97] = true;
						prev = now;
						check = true;
					} else {
						check = false;
						break;
					}
				}
			}
			
			if(check) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
