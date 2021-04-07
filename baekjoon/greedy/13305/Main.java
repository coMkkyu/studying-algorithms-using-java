package _13305;

/**
 * @author COMKKYU
 * @date 2021. 4. 7
 * 
 * 그리디 - 주유소
 * https://www.acmicpc.net/problem/13305
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		/**
		 * 왼쪽도시부터 시작해서 해당 도시보다 싼 기름값을 가진 도시가 나타나기 전까지는
		 * 시작도시에서 해당 도시전까지의 거리
		 * 기름을 구매해서 이동해야 하는 것이 최소비용이 된다.
		 * 따라서 각 시작도시에서 최대한 갈 수 있는 (비용이 더 저렴한 도시가 나올 때까지) 도시를 찾고
		 * 그 도시까지 갈 수 잇는 기름만 구매하면서 맨 오른쪽 도시 까지 진행하면 된다.
		 */
		int[] dist = new int[N - 1]; // 도시를 연결하는 도로의 길이
		int[] cost = new int[N]; // 각 도시의 기름 리터당 기름 가격
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N - 1; i++) {
			dist[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum = 0;
		long minCost = cost[0]; // 이전 까지의 과정 중 주유 최소 비용
		
		for (int i = 0; i < N - 1; i++) {
			/**
			 * 현재 주유소가 이전 주유소의 기름값보다 쌀 경우
			 * minCost를 갱신한다.
			 */
			if (cost[i] < minCost) {
				minCost = cost[i];
			}
			
			sum += minCost * dist[i];
		}
		
		System.out.println(sum);
	}

}
