package get_the_middle_character;

/**
 * 
 * @author COMKKYU
 * @date 2021. 2. 17
 * 
 * 연습문제 - 가운데 글자 가져오기
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 *
 */
public class GetTheMiddleCharacter {

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "qwer";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
	}
	
	public static String solution(String s) {
        String answer = "";
        int pos = s.length() / 2;
        
        answer = (s.length() % 2 == 0) ? s.substring(pos - 1, pos + 1) : s.substring(pos, pos + 1);
        
        return answer;
    }
}
