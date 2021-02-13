package _1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [소수 구하기]
	 *  M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
	 *  기존에 풀었던 2581번 문제와 동일한 내용이지만 이 문제의 경우 '에라토스테네스의 체' 알고리즘으로 풀어야 함.
	 *  ArrayList를 이용해서 풀었지만 Array를 이용해서 풀면 메모리와 시간이 더 절약되는 듯 함.
	 */
	public static void main(String[] args) throws IOException {
		ArrayList<Boolean> primeList;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		primeList = new ArrayList<Boolean>();
		getEratos(primeList, N);
		
		for (int i = M; i <= N; i++) {
			if(primeList.get(i)) sb.append(i+"\n");
		}
		
		System.out.println(sb);
	}
	
	static void getEratos(ArrayList<Boolean> list, int N) {
		list.add(false);
		list.add(false);
		
		if(N < 2) return;
		
		
		for(int i = 2; i <= N; i++) {
			list.add(i, true);
		}
		
		for(int i = 2; i * i <= N; i++) {
			if(list.get(i)) {
				for(int j = i * i; j <= N; j += i) list.set(j, false);
			}
		}
		
	}

}
