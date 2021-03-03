package lifeboat;

/**
 * @author COMKKYU
 * @date 2021. 3. 3
 * 
 * 탐욕법(Greedy) - 구명보트
 * https://programmers.co.kr/learn/courses/30/lessons/42885
 * 
 */
import java.util.Arrays;

public class Lifeboat {

	public static void main(String[] args) {
		int[] people = { 70, 50, 80, 50 };
		int limit = 100;
		
		System.out.println(solution(people, limit));
	}

	public static int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        
        // 최대값과 최소값을 비교하기 위해서 오름차순으로 정렬
        Arrays.sort(people);
        
        for(int max = people.length - 1; min <= max; max--) {
        	// 최대값과 최소값의 합이 보트의 제한 무게를 넘기면 최대값 무게 혼자만 보트를 이용
            if(people[max] + people[min] > limit) {
                answer++;
            } else {
            	// 최대값과 최소값이 제한무게 이내라면 같이 보트를 태우고 최소값을 다음 값으로 증가
                answer++;
                min++;
            }
        }
        
        return answer;
    }
}
