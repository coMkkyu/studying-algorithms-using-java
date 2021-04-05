package _1874;

/**
 * @author COMKKYU
 * @date 2021. 4. 5
 * 
 * 스택 - 스택 수열
 * https://www.acmicpc.net/problem/1874
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int start = 0;
		boolean check = true;
		
		int n = Integer.parseInt(br.readLine());
		
		// N번 반복
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num > start) {
				// start + 1 부터 입력받은 num 까지 push
				for (int j = start + 1; j <= num; j++) {
					stack.push(j);
					sb.append('+').append('\n');
				}
				
				// 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
				start = num;
			}
			
			// top에 있는 원소가 입력받은 num이랑 다른 경우 만들수 없는 수열이므로 false
			else if (stack.peek() != num) {
				check = false;
			}
			
			stack.pop();
			sb.append('-').append('\n');
			
		}
		
		if (!check) System.out.println("NO");
		else {
			System.out.println(sb.toString());
		}
	}
	
}
