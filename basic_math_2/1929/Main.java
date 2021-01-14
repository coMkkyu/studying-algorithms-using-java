package _1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  [�Ҽ� ���ϱ�]
	 *  M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *  ������ Ǯ���� 2581�� ������ ������ ���������� �� ������ ��� '�����佺�׳׽��� ü' �˰������� Ǯ��� ��.
	 *  ArrayList�� �̿��ؼ� Ǯ������ Array�� �̿��ؼ� Ǯ�� �޸𸮿� �ð��� �� ����Ǵ� �� ��.
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
