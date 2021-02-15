package Practice_test;

/**
 * @author coMkkyu
 * @date 2021. 2. 15
 * 
 * 완전탐색 - 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */

import java.util.ArrayList;

public class PracticeTest {

	public static void main(String[] args) {
		int[] answers1 = {1, 2, 3, 4, 5};
		int[] answers2 = {1, 3, 2, 4, 2};
		
		System.out.print("answers1[1,2,3,4,5] : ");
		
		for (int i : solution(answers1)) {
			System.out.print(" "+i);
		}
		
		System.out.println();
		System.out.print("answers2[1,3,2,4,2] : ");
		
		for (int i : solution(answers2)) {
			System.out.print(" "+i);
		}
	}
	
	public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score1 = 0, score2 = 0, score3 = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if(person1[i % person1.length] == answers[i]) {
                score1++;
            }
            if(person2[i % person2.length] == answers[i]) {
                score2++;
            }
            if(person3[i % person3.length] == answers[i]) {
                score3++;
            }
        }
        
        int max = Math.max(score1, Math.max(score2, score3));
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max == score1) list.add(1);
        if(max == score2) list.add(2);
        if(max == score3) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
