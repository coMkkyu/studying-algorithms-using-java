package _10773;

/**
 * @author COMKKYU
 * @date 2021. 4. 5
 * 
 * 스택 - 제로
 * https://www.acmicpc.net/problem/10773
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < K; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if (input == 0) stack.pop();
			else stack.push(input);
		}
		
		int sum = 0;
		
		for (int num : stack) {
			sum += num;
		}
		
		System.out.println(sum);
	}
	
}