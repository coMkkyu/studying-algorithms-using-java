package Gym_suit;

/**
 * 
 * @author coMkkyu
 * @date 2021. 2. 15
 * 
 * Ž���(Greedy) - ü����
 * https://programmers.co.kr/learn/courses/30/lessons/42862#
 */

public class GymSuit {

	public static void main(String[] args) {
		int n = 7;
		int[] lost = {2, 3, 4, 6};
		int[] reserve = {1, 2, 3};
		
		System.out.println(solution(n, lost, reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        /**
         * 0 : ü���� O
         * 1 : ü���� ���� O
         * -1 : ü���� X
         */
        int[] count = new int[n];
        
        // ü������ �������� �л����� -1
        for(int i : lost) {
            count[i - 1]--;
        }
        
        // ������ ü������ ���� �л����� 1
        for(int i : reserve) {
            count[i - 1]++;
        }
        
        for(int i = 0; i < n; i++) {
        	// ������ ü������ ������ ������ �������� �л��� ��� �� �������� 0�� �����Ƿ�
        	// ���ǿ��� ���ܵȴ�.
            if(count[i] < 0) {
            	// �� ó�� �л��� ���� ��ȣ �л����� ���� �� ����.
                if(i != 0 && count[i - 1] > 0) {
                    count[i]++;
                    count[i - 1]--;
                } else if(i != n - 1 && count[i + 1] > 0) { // �� �� �л��� ���� ��ȣ �л����� ���� �� ����.
                    count[i]++;
                    count[i + 1]--;
                }
            }
        }
        
        for(int i : count) {
            if(i >= 0) answer++;
        }
        
        return answer;
    }
}
