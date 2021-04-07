package _1931;

/**
 * @author COMKKYU
 * @date 2021. 4. 7
 * 
 * 그리디 - 회의실 배정
 * https://www.acmicpc.net/problem/1931
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] time = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			/**
			 * time[][0] : 회의 시작 시각
			 * time[][1] : 회의 종료 시각
			 */
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 종료시각을 기준으로 오름차순 정렬
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료 시각이 같을 경우 시작 시각이 빠른순으로 정렬
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
		});
		
		int count = 0;
		int prev_end_time = 0; // 이전 회의 종료 시각
		
		for (int i = 0; i < N; i++) {
			
			// 직전 회의 종료시각이 다음 회의 시작 시각보다 작거나 같다면 갱신
			if (prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
