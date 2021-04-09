package _11866;

/**
 * @author COMKKYU
 * @date 2021. 4. 9
 * 
 * 큐, 덱 - 요세푸스 문제 0
 * https://www.acmicpc.net/problem/11866
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		ArrayList<String> result  = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		
		while (!queue.isEmpty()) {
			
			for (int i = 0; i < K - 1; i++) {
				queue.offer(queue.poll());
			}
			
			result.add(String.valueOf(queue.poll()));
		}
		
		sb.append("<").append(String.join(", ", result)).append(">");
		
		System.out.println(sb);
	}

}
