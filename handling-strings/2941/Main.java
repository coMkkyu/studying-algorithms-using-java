package _2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = str.length();
		int count = 0;
		
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			
			// i < len - 1 조건 없이 처음에 구현해서 indexBountException 오류 발생
			if(c == 'c' && i < len - 1) {
				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') {
					i++;
				}
			} else if(c == 'd' && i < len - 1) {
				// dz=의 경우에는 3글자가 1글자이기 때문에 i < len - 2 조건을 충족시키는 상황에서
				// z가 나올경우 해당 조건문을 실행하도록 수정
				if(str.charAt(i+1) == 'z' && i < len - 2) {
					if(str.charAt(i+2) == '=') {
						i += 2;
					}
				} else if(str.charAt(i+1) == '-') {
					i++;
				}
			} else if((c == 'l' || c == 'n') && i < len - 1) {
				if(str.charAt(i+1) == 'j') {
					i++;
				}
			} else if((c == 's' || c == 'z') && i < len - 1) {
				if(str.charAt(i+1) == '=') {
					i++;
				}
			}
			
			count++;
		}
		
		System.out.println(count);
	}

}
