package _18258;

/**
 * @author COMKKYU
 * @date 2021. 4. 9
 * 
 * 큐, 덱 - 큐2
 * https://www.acmicpc.net/problem/18258
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int[] queue;
	private static int size = 0;
	private static int front = 0;
	private static int back = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		queue = new int[N];
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			
			switch (command) {
			case "push":
				int x = Integer.parseInt(st.nextToken());
				push(x);
				break;
			case "pop":
				sb.append(pop()).append('\n');
				break;
			case "size":
				sb.append(size()).append('\n');
				break;
			case "empty":
				sb.append(empty()).append('\n');
				break;
			case "front":
				sb.append(front()).append('\n');
				break;
			case "back":
				sb.append(back()).append('\n');
				break;
			}
		}
		
		System.out.println(sb);
	}
	
	public static void push(int x) {
		queue[back] = x;
		back++;
		size++;
	}
	
	public static int pop() {
		if (size == 0) {
			return -1;
		}
		else {
			int num = queue[front];
			front++;
			size--;
			return num;
		}
	}

	public static int size() {
		return size;
	}
	
	public static int empty() {
		if (size == 0) return 1;
		return 0;
	}
	
	public static int front() {
		if (size == 0) {
			return -1;
		}
		else {
			return queue[front];
		}
	}
	
	public static int back() {
		if (size == 0) {
			return -1;
		}
		else {
			return queue[back - 1];
		}
	}
}
