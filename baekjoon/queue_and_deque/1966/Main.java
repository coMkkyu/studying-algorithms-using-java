package _1966;

/**
 * @author COMKKYU
 * @date 2021. 4. 9
 * 
 * 큐, 덱 - 프린터 큐
 * https://www.acmicpc.net/problem/1966
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while (T-- > 0) {
			LinkedList<int[]> queue = new LinkedList<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for (int i = 0; i < N; i++) {
				queue.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
			}
			
			int count = 0;
			
			while (!queue.isEmpty()) { // 한 케이스에 대한 반복문
				
				int[] front = queue.poll(); // 가장 첫 원ㅅ
				boolean isMax = true; // front 원소가 가장 큰 원소인지를 판단하는 변수
				
				// 큐에 남아있는 원소들과 중요도를 비교
				for (int i = 0; i < queue.size(); i++) {
					
					// 처음 뽑은 원소보다 큐에 있는 i번째 원소의 중요도가 클 경우
					if (front[1] < queue.get(i)[1]) {
						
						// 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다.
						queue.offer(front);
						for (int j = 0; j < i; j++) {
							queue.offer(queue.poll());
						}
						
						// front 원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색을 마침
						isMax = false;
						break;
					}
				}
				
				// front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
				if (!isMax) continue;
				
				// front 원소가 가장 큰 원소 였으므로 해당 원소는 출력해야하는 문서다.
				count++;
				if (front[0] == M) break;
			}
			
			sb.append(count).append('\n');
			
		}
		
		System.out.println(sb);
	}
}
