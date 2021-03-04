package joystick;

/**
 * 
 * @author COMKKYU
 * @date 2021. 3. 4
 * 
 * 탐욕법(Greedy) - 조이스틱
 * https://programmers.co.kr/learn/courses/30/lessons/42860
 *
 */
public class Joystick {

	public static void main(String[] args) {
		String name = "JEROEN";
		
		System.out.println(solution(name));
	}

	public static int solution(String name) {
        int answer = 0;
        int len = name.length();
        int cursor_count = len - 1;
        
        for(int i = 0; i < len; i++) {
            char c = name.charAt(i);
            // 조이스틱을 위 아래로 움직이는 경우
            answer += c <= 'M' ? c - 'A' : 'Z' - c + 1;
            
            int next = i + 1;
            // 조이스틱을 좌 우로 움직이는 경우 탐색
            while(next < len && name.charAt(next) == 'A') {
                next++;
            }
            
            // i + len - next + i : 현재위치에서 다시 처음위치로 돌아가서 남은 개수만큼 커서를 이동한 횟수
            cursor_count = Math.min(cursor_count, i + len - next + i);
        }
        
        answer += cursor_count;
        
        return answer;
    }
}
