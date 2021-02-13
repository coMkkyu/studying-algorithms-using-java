package _2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String result = null;
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int loopCount = Integer.parseInt(st.nextToken());
			byte[] b = st.nextToken().getBytes();

			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < loopCount; k++) {
					sb.append((char)b[j]);
				}
			}
			
			sb.append("\n");
		}
		
		result = sb.toString();
		System.out.print(result);
	}
}
