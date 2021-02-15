package Kth_number;

/**
 * @author coMkkyu
 * @date 2021. 2. 15
 * 
 * 정렬 - K번째수
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */

import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3}
		};
		int[] result = new int[commands.length];
		
		result = solution(array, commands);
		
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
        	// Arrays.copyOfRange(array, start, end)
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        
        return answer;
    }
}
