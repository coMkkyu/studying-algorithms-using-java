package _2164;

/**
 * @author COMKKYU
 * @date 2021. 4. 9
 * 
 * 큐, 덱 - 카드2
 * https://www.acmicpc.net/problem/2164
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		
		// 마지막 카드가 한장 남을 때 까지 반복
		while (queue.size() > 1) {
			// 제일 위에 있는 카드를 버림
			queue.poll();
			// 남아있는 카드 중에서 제일 위에있는 카드를 제일 아래로 옮김
			int top = queue.poll();
			queue.offer(top);
		}
		
		System.out.println(queue.poll());
	}

}
