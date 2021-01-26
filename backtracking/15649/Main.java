package _15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	/**
	 *  [N 과 M] (1)
	 *  자연수 N 과 M 이 주어졌을 때, 아래 조건을 만족하는 길이가 M 인 수열을 모두 구하는 프로그램을 작성하시오.
	 *  1 부터 N 까지 자연수 중에서 중복 없이 M 개를 고른 수열(각 수열은 공백으로 구분해서 출력), (1 <= M <= N <= 8)
	 */
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visit = new boolean[N];
		
		dfs(N, M, 0);
		
		System.out.println(sb);
	}
	
	/**
	 *  백트래킹의 방법 중 하나인 DFS(깊이우선탐색) 을 사용해서 구현
	 *  depth 를 통해서 재귀가 깊어질 때마다 depth 를 1 씩 증가시켜 M 과 같아지면 더 이상 재귀를 호출하지 않고
	 *  탐색과정 중 값을 담았던 arr 배열을 출력해주고 return.
	 * 
	 * @param N : 1 부터 N 까지의 자연수를 사용
	 * @param M : 길이가 M 인 수열
	 * @param depth : 깊이우선탐색(dfs)할 트리의 높이
	 */
	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
}
