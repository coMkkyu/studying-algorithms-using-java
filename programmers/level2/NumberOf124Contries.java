package number_of_123_contries;

/**
 * 
 * @author COMKKYU
 * @date 2021. 2. 26
 * 
 * 연습문제 - 124 나라의 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12899
 *
 */
public class NumberOf124Contries {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(solution(n));
	}

	public static String solution(int n) {
        String answer = "";
        // n의 나머지에 따라서 끝자리 숫자가 정해지는 규칙을 이용
        String[] s = {"4", "1", "2"};
        
        while(n != 0) {
        	// n의 나머지를 이용해서 끝자리 숫자를 구하고
            answer = s[n % 3] + answer;
            // n - 1의 몫을 활용해서 그 다음 자리수의 나머지를 구한다.
            n = (n - 1) / 3;
        }
        
        return answer;
    }
}
