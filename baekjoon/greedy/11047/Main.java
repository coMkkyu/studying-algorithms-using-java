package _11047;

/**
 * @author COMKKYU
 * @date 2021. 4. 5
 * 
 * 그리디 - 동전 0
 * https://www.acmicpc.net/problem/11047
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] value = new int[N];
		
		for (int i = 0; i < N; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		
		int maxIdx = 0;
		int count = 0;
		
		while (K != 0) {
			maxIdx = findMaxIdx(value, K);
			count += K / value[maxIdx];
			K %= value[maxIdx];
		}
		
		/**
		 * 아래와 같이 구현하면 findMaxIdx 함수를 따로 만들어줄 필요가 없다.
		 */
//		for (int i = N - 1; i >= 0; i--) {
//			if (value[i] <= K) {
//				count += K / value[i];
//				K %= value[i];
//			}
//		}
		
		System.out.println(count);
	}
	
	// 배열 arr에서 n의 값을 넘지않는 최대의 index 반환
	public static int findMaxIdx(int[] arr, int n) {
		int idx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] <= n) {
				idx = i;
			}
		}
		
		return idx;
	}

}
