package largest_number;

/**
 * 
 * @author COMKKYU
 * @date 2021. 3. 3
 * 
 * 정렬 - 가장 큰 수
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 * 
 */
import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		int[] numbers = { 3, 30, 34, 5, 9 };
		
		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
        String answer = "";
        String[] str_numbers = new String[numbers.length];
        
        // int 배열을 String 배열로 변환
        for(int i = 0; i < numbers.length; i++) {
            str_numbers[i] = String.valueOf(numbers[i]);
        }
        
        /**
         * 람다식을 통해서 String을 사전순 내림차순으로 정렬
         * 아래코드와 동일한 표현방식
         * 
         * Arrays.sort(str_numbers, new Comparator<String>() {
         * 	@override
         * 	public int compare(String str1, String str2) {
         * 		return (str2 + str1).compareTo(str1 + str2);
         * 	}
         * });
         */
        Arrays.sort(str_numbers, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        
        // 0이 중복될 경우(0이 가장 큰 수일 경우에는 0만 반환)
        if(str_numbers[0].equals("0")) {
            return answer = "0";
        }
        
        for(String num : str_numbers) {
            answer += num;
        }
        
        return answer;
    }
}
