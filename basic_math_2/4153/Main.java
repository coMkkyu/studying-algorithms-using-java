package _4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	/**
	 * 	[직각삼각형]
	 *  과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
	 *  주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
	 *  입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
	 *  각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int ausar = Integer.parseInt(st.nextToken());
			int auset = Integer.parseInt(st.nextToken());
			int heru = Integer.parseInt(st.nextToken());
			
			if(ausar == 0 && auset == 0 && heru == 0) break;
			
			// 문제에서 각 변의길이가 길이 순서대로 주어진다는 보장이 없기때문에 3가지 조건에 대해서
			// 빗변일 경우에 대해 피타고라스의 정리를 적용해야한다.
			// 단순히 heru를 빗변으로 계산해서 구현했다가 틀린 문제...
			if((ausar * ausar) + (auset * auset) == (heru * heru))
				sb.append("right").append("\n");
			else if((auset * auset) + (heru * heru) == (ausar * ausar))
				sb.append("right").append("\n");
			else if((heru * heru) + (ausar * ausar) == (auset * auset))
				sb.append("right").append("\n");
			else
				sb.append("wrong").append("\n");
		}
		
		System.out.println(sb);
	}

}
