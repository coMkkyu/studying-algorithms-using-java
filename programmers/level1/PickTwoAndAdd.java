package Pick_two_and_add;

/**
 * @author coMkkyu
 * @date 2021. 2. 13
 * 
 * ���� �ڵ� ç���� ���� 1 - �ΰ� �̾Ƽ� ���ϱ�
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 */

import java.util.ArrayList;
import java.util.Arrays;

public class PickTwoAndAdd {

	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		int[] result = solution(numbers);
		
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                
                // �ߺ� ó��
                if(!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
