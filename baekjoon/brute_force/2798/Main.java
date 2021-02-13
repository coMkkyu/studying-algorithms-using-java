package _2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		int idx = 0;
		
		while(st.hasMoreTokens()) {
			arr[idx++] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int maxIdx = 0;
		
		for (int i = N-1; i >= 0; i--) {
			if(arr[i] < M) {
				maxIdx = i;
				break;
			}
		}
		
		int result = getBlackJackScore(arr, maxIdx, M);
		System.out.println(result);
	}
	
	static int getBlackJackScore(int[] arr, int maxIdx, int M) {
		int result = 0;
		int sum = 0;
		
		for (int i = 0; i < maxIdx - 1; i++) {
			for (int j = i + 1; j < maxIdx; j++) {
				for (int k = j + 1; k < maxIdx + 1; k++) {
					sum = arr[i] + arr[j] + arr[k];
					
					if (M == sum) return sum;
					if (result < sum && sum < M) result = sum;
				}
			}
		}
		
		return result;
	}

}
