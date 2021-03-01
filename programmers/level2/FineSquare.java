package fine_square;

/**
 * 
 * @author COMKKYU
 * @date 2021. 3. 1
 * 
 * Summer/Winter Coding(2019) - 멀쩡한 사각형
 * https://programmers.co.kr/learn/courses/30/lessons/62048
 *
 */
public class FineSquare {

	public static void main(String[] args) {
		long w = 8;
		long h = 12;
		
		System.out.println(solution(w, h));
	}
	
	/**
	 * 가장작은 직사각형 부터 그려보면서 규칙을 파악해서 풀려고 했지만 
	 * 생각보다 너무 어려워서 일차 함수 그래프로 접근해서 해결
	 * y = h/w * x의 일차함수로 적용하면 각 x 좌표마다 y 값이 멀쩡한 정사각형의 개수가 된다.
	 * 그래프를 기준으로 대칭 구조이므로 마지막에 구한 값의 2배를 리턴.
	 * 
	 * @param w 직사각형의 너비
	 * @param h 직사각형의 높이
	 * @return 대각선으로 잘랐을 때 대각선이 지나지 않는 사각형의 개수
	 */
	public static long solution(long w, long h) {
		long answer = 0;
        
        for(int i = 0; i < w; i++) {
            answer += h * i / w;
        }
        
        return answer * 2;
	}
}
