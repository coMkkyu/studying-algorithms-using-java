package _4949;

/**
 * @author COMKKYU
 * @date 2021. 4. 5
 * 
 * 스택 - 균형잡힌 세상
 * https://www.acmicpc.net/problem/4949
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String s = br.readLine();
			
			if(s.equals(".")) break;
			
			sb.append(solve(s)).append("\n");
		}
		
		System.out.println(sb.toString());
	}

	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		int len = s.length();
		
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			
			// 여는 괄호일 경우
			if (c == '(' || c == '[') {
				stack.push(c);
			}
			
			// 닫는 소괄호 일 경우
			else if (c == ')') {
				// 스택이 비어있거나 pop할 원소가 소괄호가 아닐 경우
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
			
			// 닫는 대괄호 일 경우
			else if (c == ']') {
				// 스택이 비어있거나 pop할 원소가 대괄호가 아닐 경우
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
		}
		
		if (stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}
