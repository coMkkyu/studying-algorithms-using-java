package truck_passing_the_bridge;

/**
 * @author COMKKYU
 * @date 2021. 3. 2
 * 
 * 스택/큐 - 다리를 지나는 트럭
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

public class TruckPassingTheBridge {

	public static void main(String[] args) {
		int bridge_length = 2, weight = 10;
		int[] truck_weights = {7, 4, 5, 6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        // 다리를 건너는 트럭을 저장할 큐
        Queue<Integer> queue = new LinkedList<>();
        
        // 다리가 견딜 수 있는 무게를 초과하는지 비교할 현재 다리 위 트럭의 무게 변수
        int currentWeight = 0;
        
        // 모든 트럭이 다리에 진입할 때 까지 반복
        for(int w : truck_weights) {
            
            while(true) {
            	// 다리가 비어있을 경우
                if(queue.isEmpty()) {
                	// 큐에 해당 무게의 트럭을 넣고, 현재 가중치를 추가하고, 1초 증가
                    queue.offer(w);
                    currentWeight += w;
                    ++answer;
                    break;
                } else if(queue.size() == bridge_length) {
                	// 큐의 사이즈가 다리의 길이와 같아지면 가장 먼저 다리에 진입한 트럭이
                	// 다리를 건넜으므로 큐에서 제거하고 현재 가중치에서 제외
                    currentWeight -= queue.poll();
                } else { // 다리를 건너는 동시에 새로운 트럭이 진입하거나 기존트럭이 계속 진행하므로 여기서 1초 추가
                    if(currentWeight + w > weight) {
                    	// 다음 트럭의 무게가 다리가 견딜 수 있는 무게를 초과한다면 기존 트럭만 진행시키기 위해 0을 추가
                        ++answer;
                        queue.offer(0);
                    } else {
                    	// 큐에 해당 무게의 트럭을 넣고, 현재 가중치를 추가하고, 1초 증가
                        queue.offer(w);
                        currentWeight += w;
                        ++answer;
                        break;
                    }
                }
            }
        }
        
        // 최종적으로 마지막 트럭이 다리에 진입했을 때 반복문이 종료되므로 다리의 길이만큼 answer에 추가
        return answer + bridge_length;
    }
}
