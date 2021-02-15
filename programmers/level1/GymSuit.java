package Gym_suit;

/**
 * 
 * @author coMkkyu
 * @date 2021. 2. 15
 * 
 * 탐욕법(Greedy) - 체육복
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
         * 0 : 체육복 O
         * 1 : 체육복 여벌 O
         * -1 : 체육복 X
         */
        int[] count = new int[n];
        
        // 체육복을 도난당한 학생들은 -1
        for(int i : lost) {
            count[i - 1]--;
        }
        
        // 여벌의 체육복을 가진 학생들은 1
        for(int i : reserve) {
            count[i - 1]++;
        }
        
        for(int i = 0; i < n; i++) {
        	// 여벌의 체육복을 가지고 있지만 도난당한 학생의 경우 위 과정에서 0이 됐으므로
        	// 조건에서 제외된다.
            if(count[i] < 0) {
            	// 맨 처음 학생은 이전 번호 학생에게 빌릴 수 없다.
                if(i != 0 && count[i - 1] > 0) {
                    count[i]++;
                    count[i - 1]--;
                } else if(i != n - 1 && count[i + 1] > 0) { // 맨 뒤 학생은 이후 번호 학생에게 빌릴 수 없다.
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
