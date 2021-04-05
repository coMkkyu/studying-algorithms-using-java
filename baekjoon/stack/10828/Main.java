package _10828;

/**
 * @author COMKKYU
 * @date 2021. 4. 4
 * 
 * 스택 - 스택
 * https://www.acmicpc.net/problem/10828
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		stack = new int[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String opr = st.nextToken();
			
			switch (opr) {
			case "push":
				int x = Integer.parseInt(st.nextToken());
				push(x);
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "top":
				sb.append(top()).append("\n");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opr);
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static void push(int x) {
		stack[size] = x;
		size++;
	}
	
	public static int pop() {
		if (size == 0) {
			return -1;
		} else {
			int ret = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return ret;
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int top() {
		if (size == 0) {
			return -1;
		} else {
			return stack[size - 1];
		}
	}
}
