package _10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder roomNumber = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
//			int W = 
			Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int numberOfFloors = ((N - 1) % H) + 1;
			int numberOfEnd = (N / H) + 1;
			
			numberOfEnd += (N % H == 0) ? -1 : 0;
			
			roomNumber.append(Integer.toString(numberOfFloors));
						
			if(numberOfEnd < 10) {
				roomNumber.append("0");
			} 
			
			roomNumber.append(Integer.toString(numberOfEnd)).append("\n");
		}
		
		System.out.println(roomNumber);
	}

}
