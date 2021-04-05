package _9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			if(vps(str)) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static boolean vps(String str) {
		Stack<Character> stack = new Stack<>();
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			
			// 여는 괄호일 경우 스택에 추가
			if (c == '(') {
				stack.push(c);
			}
			
			// 스택이 비어있는 경우. 즉, 닫는 괄호를 입력받았으나 pop할 괄호가 없는 경우
			else if (stack.empty()) {
				return false;
			}
			
			// 그 외의 경우 스택에서 제거
			else {
				stack.pop();
			}
		}
		
		/**
		 * 모든 검사를 마치고 스택에 잔여 원소가 있으면 불완전한 괄호
		 * 스택이 비어있으면 완전한 괄호이므로 true 반환
		 */
		if (stack.empty()) {
			return true;
		} else {
			return false;
		}
		
	}

}
