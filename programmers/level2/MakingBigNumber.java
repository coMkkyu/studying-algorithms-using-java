package making_big_number;

/**
 * @author COMKKYU
 * @date 2021. 3. 26
 * 
 * 탐욕법(Greedy) - 큰 수 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/42883
 *
 */
public class MakingBigNumber {

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		
		System.out.println(solution(number, k));
	}

	/**
	 * number에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 수를 구하는 함수
	 */
	public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        
        int pos = 0;
        int max = 0;
        
        /**
         * number.length() - k 만큼의 자리수를 가진 수를 반환해야 하므로
         * 가장 큰 자리수의 값을 찾는 반복문은 number.length() - k 만큼 반복하면 된다.
         */
        for (int i = 0; i < number.length() - k; i++) {
            max = 0;
            
            /**
             * 현재 위치  pos 부터 i + k 까지 반복, 즉 현재 남은 자리수를 제외한 탐색 범위를 지정
             * 최종적으로 i = number.length() - k - 1 일때 i + k 의 값은 number.length() - 1이 되므로
             * 마지막 index를 가리키게 된다.
             */
            for (int j = pos; j <= i + k; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    pos = j + 1;
                }
            }
            // 탐색한 범위 내에서 가장 큰 숫자를 append 해준다.
            answer.append(max);
        }
        
        return answer.toString();
    }
}
