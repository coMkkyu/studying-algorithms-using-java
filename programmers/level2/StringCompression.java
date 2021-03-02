package string_compression;

/**
 * 
 * @author COMKKYU
 * @date 2021. 3. 2
 * 
 * 2020 KAKAO BLIND RECRUITMENT - 문자열 압축
 * https://programmers.co.kr/learn/courses/30/lessons/60057
 *
 */
public class StringCompression {

	public static void main(String[] args) {
		String[] arr = {
				"aabbaccc",
				"ababcdcdababcdcd",
				"abcabcdede",
				"abcabcabcabcdededededede",
				"xababcdcdababcdcd"
		};
		
		for(String s : arr) {
			System.out.println(solution(s));
		}
	}

	public static int solution(String s) {
		// 최소 개수를 구하기 위해서 문자열 길이로 초기화
        int answer = s.length();
        
        // 단위 개수 Loop
        for(int i = 1; i <= s.length() / 2; i++) {
        	// 현재 탐색할 문자의 시작 위치
            int pos = 0;
            // 최종적으로 압축한 문자열의 길이를 저장할 변수
            int len = s.length();
            
            for( ; pos + i <= s.length(); ) {
            	// 단위 개수인 i만큼 unit을 구성
                String unit = s.substring(pos, pos + i);
                pos += i;
                
                // 같은 unit이 뒤에 몇개가 오는지 확인할 변수
                int cnt = 0;
                for( ; pos + i <= s.length(); ) {
                    if(unit.equals(s.substring(pos, pos + i))) {
                        cnt++;
                        pos += i;
                    } else {
                        break;
                    }
                }
                
                if(cnt > 0) {
                	// 단위 개수 * 반복 unit의 개수 만큼 len에서 뺀다.
                    len -= i * cnt;
                    
                    /**
                     * 2a, 10a, 100a, 1000a에 대한 조건문 처리
                     */
                    if(cnt < 9) len += 1;
                    else if(cnt < 99) len += 2;
                    else if(cnt < 999) len += 3;
                    else len += 4;
                }
            }
            
            // 압축된 문자열의 길이와 초기 문자열의 길이를 비교해서 더 작은 값을 저장
            // 최종적으로 반복문이 끝나면 압축했을 때 가장 작은 길이가 저장된다.
            answer = Math.min(answer, len);
        }
        
        return answer;
    }
}
