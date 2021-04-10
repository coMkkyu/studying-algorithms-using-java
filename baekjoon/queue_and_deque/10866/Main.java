package _10866;

/**
 * @author COMKKYU
 * @date 2021. 4. 10
 * 
 * 큐, 덱 - 덱
 * https://www.acmicpc.net/problem/10866
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int[] deque;
	private static int size = 0;
	private static int front = 0;
	private static int back = 0;
	
	/**
	 * Deque 배열에서 front가 최종적으로 가리키는 위치는 항상 비워둔다.
	 * 즉, 가장 앞에 있는 원소는 front + 1이 된다.
	 * 
	 * 이유는 만약 front의 최종 위치에 원소를 넣게 되면 다음과 같은 예외가 발생한다.
	 * 
	 * 예를들어 push_front(3)을 실행하려 하는데 아무 원소도 없을 때
	 * front--; 감소시킨 뒤 deque[front] = 3; 이 되면
	 * deque[9999] = 3; 이 된다. 이때 front = 9999; back = 0; 이 된다.
	 * 
	 * 하지만, 원소가 한 개만 있을 경우 해당 원소는 front 이자 back 원소가 된다.
	 * 이러한 경우를 방지하기 위해 deque[front]에 원소를 넣은 뒤,
	 * front = (front - 1 + array.length) % array.length; 을 해준다.
	 * 
	 * 결과적으로 front 요소 자체는 deque[(front + 1) % array.length] 위치에 자리한다.
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		deque = new int[N];
		
		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			String command = st.nextToken();
			
			switch (command) {
			case "push_front":
				int x = Integer.parseInt(st.nextToken());
				push_front(x);
				break;
			case "push_back":
				int y = Integer.parseInt(st.nextToken());
				push_back(y);
				break;
			case "pop_front":
				sb.append(pop_front()).append('\n');
				break;
			case "pop_back":
				sb.append(pop_back()).append('\n');
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
			default:
				throw new IllegalArgumentException("Unexpected value: " + command);
			}
		}
		
		System.out.println(sb);
	}
	
	static void push_front(int x) {
		// front에 원소를 넣는다.
		deque[front] = x;
		// 음수가 되지 않도록 배열 크기만큼 더해준다.
		front = (front - 1 + deque.length) % deque.length;
		size++;
	}
	
	static void push_back(int x) {
		// 맨 마지막 까지 꽉찼을 경우 0으로 가리키기 위해서 배열 크기만큼 나눠 나머지를 구한다.
		back = (back + 1) % deque.length;
		size++;
		deque[back] = x;
	}
	
	static int pop_front() {
		if (size == 0) return -1;
		else {
			/**
			 * front + 1이 front 원소이므로 해당 원소를 임시 변수에 둔 뒤
			 * front을 +1 증가 시킨다.
			 */
			int val = deque[(front + 1) % deque.length];
			front = (front + 1) % deque.length;
			size--;
			return val;
		}
	}
	
	static int pop_back() {
		if (size == 0) return -1;
		else {
			int val = deque[back];
			back = (back - 1 + deque.length) % deque.length;
			size--;
			return val;
		}
	}
	
	static int size() {
		return size;
	}
	
	static int empty() {
		if (size == 0) return 1;
		return 0;
	}
	
	static int front() {
		if (size == 0) return -1;
		else {
			return deque[(front + 1) % deque.length];
		}
	}
	
	static int back() {
		if (size == 0) return -1;
		else {
			return deque[back];
		}		
	}
}
