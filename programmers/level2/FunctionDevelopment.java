package function_development;

/**
 * 
 * @author COMKKYU
 * @date 2021. 2. 17
 * 
 * 스택/큐 - 기능개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 * 
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevelopment {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99 ,99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] result = solution(progresses, speeds);
		
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            queue.offer((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));
        }
        
        while(!queue.isEmpty()) {
            int count = 1;
            // 먼저 배포되어야 하는 작업
            int front = queue.poll();
            
            // 이전 작업보다 배포일이 작거나 같으면 한 세트로 처리
            while (!queue.isEmpty() && queue.element() <= front) {
                count++;
                queue.poll();
            }
            
            list.add(count);
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
