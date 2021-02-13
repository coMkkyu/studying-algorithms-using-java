package _15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	/**
	 *  [N �� M] (1)
	 *  �ڿ��� N �� M �� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M �� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *  1 ���� N ���� �ڿ��� �߿��� �ߺ� ���� M ���� �� ����(�� ������ �������� �����ؼ� ���), (1 <= M <= N <= 8)
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
	 *  ��Ʈ��ŷ�� ��� �� �ϳ��� DFS(���̿켱Ž��) �� ����ؼ� ����
	 *  depth �� ���ؼ� ��Ͱ� ����� ������ depth �� 1 �� �������� M �� �������� �� �̻� ��͸� ȣ������ �ʰ�
	 *  Ž������ �� ���� ��Ҵ� arr �迭�� ������ְ� return.
	 * 
	 * @param N : 1 ���� N ������ �ڿ����� ���
	 * @param M : ���̰� M �� ����
	 * @param depth : ���̿켱Ž��(dfs)�� Ʈ���� ����
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
