package english_ending;

/**
 * 
 * @author COMKKYU
 * @date 2021. 3. 3
 * 
 * Summer/Winter Coding(~2018) - 영어 끝말잇기
 * https://programmers.co.kr/learn/courses/30/lessons/12981
 * 
 */
import java.util.Arrays;

public class EnglishEnding {

	public static void main(String[] args) {
		String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };
		int n = 2;
		
		for(int i : solution(n, words)) {
			System.out.println(i);
		}
	}

	public static int[] solution(int n, String[] words) {
        int[] answer = { 0, 0 };
        int[] players = new int[n];
        int player = 1;
        
        for(int i = 0; i < n; i++) {
            players[i] = i + 1;
        }
        
        String[] used_words = new String[words.length];
        String prev_word = words[0];
        used_words[0] = prev_word;
        
        for(int i = 1; i < words.length; i++) {
            String word = words[i];
            player = players[i % n];
            // used_words 배열에서 word와 equals(같은) 문자열이 있는지 확인해서 true or false 반환
            boolean check = Arrays.stream(used_words).anyMatch(word::equals);
            
            // 이전단어의 끝말과 현재 단어의 첫말이 다를 경우
            // 이미 사용된 단어일 경우
            if(prev_word.charAt(prev_word.length() - 1) != word.charAt(0) 
               || check) {
                answer[0] = player;
                answer[1] = i / n + 1;
                break;
            }
            
            used_words[i] = words[i];
            prev_word = word;
        } 

        return answer;
    }
}
