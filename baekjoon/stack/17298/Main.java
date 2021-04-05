package _17298;

/**
 * @author COMKKYU
 * @date 2021. 4. 5
 * 
 * 스택 - 오큰수
 * https://www.acmicpc.net/problem/17298
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] seq = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < N; i++) {
			/**
			 * 스택이 비어있지 않고 스택에 저장된 인덱스에 해당하는 원소값(이전 원소값)보다 현재 가리키고 있는
			 * 원소값이 더 크다면 이전 원소의 값을 현재 가리키고 있는 원소의 값으로 바꿔준다.
			 */
			while (!stack.empty() && seq[stack.peek()] < seq[i]) {
				seq[stack.pop()] = seq[i];
			}
			
			stack.push(i);
		}
		
		// 최종적으로 스택에 남아있는 인덱스에 해당하는 수열의 값들은 오른쪽에 자신보다 큰 값이 없는 값들이다.
		while (!stack.empty()) {
			seq[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int num : seq) {
			sb.append(num).append(' ');
		}
		
		System.out.println(sb);
	}

}
