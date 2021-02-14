package Recommend_new_ID;

/**
 * @author coMkkyu
 * @date 2021. 2. 14
 * 
 * 2021 KAKAO BLIND RECRUITMENT - 신규 아이디 추천
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 */
public class RecommendedId {

	public static void main(String[] args) {
		String[] arr = {
			"...!@BaT#*..y.abcdefghijklm",
			"z-+.^.",
			"=.=",
			"123_.def",
			"abcdefghijklmn.p"
		};
		
		for (String s : arr) {
			System.out.println(solution(s));
		}
	}
	
	public static String solution(String new_id) {
        String answer = "";
        String recommended_id = "";
        
        // #1. 소문자로 치환
        new_id = new_id.toLowerCase();
        
        // #2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
        for(int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if('a' <= c && c <= 'z') {
                recommended_id += c;
            } else if('0' <= c && c <= '9') {
                recommended_id += c;
            } else if(c == '-' || c == '_' || c == '.') {
                recommended_id += c;
            }
        }
        
        // #3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표로 치환
        for(int i = 0; i < recommended_id.length(); i++) {
            if(recommended_id.charAt(i) == '.') {
                int next = i + 1;
                
                while(next != recommended_id.length() && recommended_id.charAt(next) == '.') {
                    next++;
                }
                
                if(next - i > 1) {
                    recommended_id = recommended_id.replace(recommended_id.substring(i, next), ".");
                }
            }
        }
        
        // #4. 마침표(.)가 처음이나 끝에 위치한다면 제거
        if(recommended_id.charAt(0) == '.') {
            recommended_id = recommended_id.substring(1);
        } else if(recommended_id.charAt(recommended_id.length() - 1) == '.') {
            recommended_id = recommended_id.substring(0, recommended_id.length() - 1);
        }
        
        // #5. 빈 문자열이라면 "a"를 대입
        if(recommended_id.length() == 0) {
            recommended_id = "a";
        }
        
        // #6. 길이가 16자 이상이면 첫 15개의 문자를 제외한 나머지 문자를 모두 제거
        // 제거 후 마침표(.)가 끝에 위치한다면 끝에 위치한 마침표(.) 제거
        if(recommended_id.length() >= 16) {
            recommended_id = recommended_id.substring(0, 15);
        }
        if(recommended_id.charAt(recommended_id.length() - 1) == '.') {
            recommended_id = recommended_id.substring(0, recommended_id.length() - 1);
        }
        
        // #7. 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될때 까지 반복해서 추가
        if(recommended_id.length() <= 2) {
            char c = recommended_id.charAt(recommended_id.length() - 1);
            while(recommended_id.length() != 3) {
                recommended_id += c;
            }
        }
        
        answer = recommended_id;
        
        return answer;
    }

}
