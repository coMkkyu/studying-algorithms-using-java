package A_player_who_could_not_finish;

/**
 * @author coMkkyu
 * @date 2021. 2. 13
 * 
 * 해시 - 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */

import java.util.Arrays;

public class PlayerWhoCouldNotFinish {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        String player = "";
        
        /*
         * 수많은 마라톤 선수들 중에서 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주.
         * 따라서 참여 선수 배열과 완주한 선수 배열을 정렬한 뒤 인덱스를 비교해서 문제를 해결할 수 있다.
         */
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
        	// 같은 자리에 서로 다른 선수의 이름이 있을 경우 해당 참가자를 player로 저장
            if(!completion[i].equals(participant[i])) {
                player = participant[i];
                break;
            }
        }
        
        // player가 초기값 ""인 경우 마지막 참가자가 완주를 하지 못한 경우
        answer = player.equals("") ? participant[participant.length - 1] : player;
        
        return answer;
    }
}
