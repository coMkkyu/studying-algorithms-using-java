package A_player_who_could_not_finish;

/**
 * @author coMkkyu
 * @date 2021. 2. 13
 * 
 * �ؽ� - �������� ���� ����
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
         * ������ ������ ������ �߿��� �� �� ���� ������ �����ϰ�� ��� ������ �������� ����.
         * ���� ���� ���� �迭�� ������ ���� �迭�� ������ �� �ε����� ���ؼ� ������ �ذ��� �� �ִ�.
         */
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
        	// ���� �ڸ��� ���� �ٸ� ������ �̸��� ���� ��� �ش� �����ڸ� player�� ����
            if(!completion[i].equals(participant[i])) {
                player = participant[i];
                break;
            }
        }
        
        // player�� �ʱⰪ ""�� ��� ������ �����ڰ� ���ָ� ���� ���� ���
        answer = player.equals("") ? participant[participant.length - 1] : player;
        
        return answer;
    }
}
