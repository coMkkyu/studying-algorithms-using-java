package _10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int idx = 0;
		int[] inputArr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			inputArr[idx++] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(inputArr);
		
		System.out.print(inputArr[0] + " " + inputArr[N-1]);
	}

}
