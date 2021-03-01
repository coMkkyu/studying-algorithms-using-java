package printer;

/**
 * @author COMKKYU
 * @date 2021. 3. 2
 * 
 * 스택/큐 - 프린터
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 * 
 */
//import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {

	public static void main(String[] args) {
//		int[] priorities = {1, 1, 9, 1, 1, 1};
		Document[] documents = {
				new Document('A', 1),
				new Document('B', 1),
				new Document('C', 9),
				new Document('D', 1),
				new Document('E', 1),
				new Document('F', 1),
		};
		int location = 0;
		
		System.out.println(solution(documents, location));
	}

	public static int solution(Document[] documents, int location) {
		// 우선순위가 높은 순서로 우선순위큐 생성
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Document> pq = new PriorityQueue<>();
        int answer = 0;
        int size = documents.length;
        
        
        for(int i = 0; i < size; i++) {
            pq.offer(documents[i]);
        }
        
        while(!pq.isEmpty()) {
            for(int i = 0; i < size; i++) {
            	// 우선순위가 높은 순서대로 기존 대기목록에 있던 작업 문서와 비교
                if(documents[i] == pq.peek()) {
                	// 해당 작업문서를 찾으면 우선순위 큐에서 제거하고 answer++
                    pq.poll();
                    answer++;
                    // 이때 해당 작업문서의 위치가 몇번째로 인쇄되는지 원하는 location일 경우
                    // 우선순위큐를 비우고 반복문을 빠져나온다.
                    if(i == location) {
                    	pq.clear();
                    	break;
                    }
                }
            }
        }       
        
        return answer;
    }
}

/**
 * 
 * 우선순위 큐의 동작과정을 정확하게 살펴보기 위해서 만든 문서 클래스
 *
 */
class Document implements Comparable<Document> {
	int priority;
	char name;
	
	public Document(char name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}
	
	/**
	 * 숫자가 높은 문서의 우선순위가 높게 하기 위해서 아래와 같이 override
	 */
	@Override
	public int compareTo(Document d) {
		return d.priority - this.priority;
	}
}
