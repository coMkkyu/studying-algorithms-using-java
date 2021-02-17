package ternary;

/**
 * 
 * @author COMKKYU
 * @date 2021. 2. 17
 * 
 * 월간 코드 챌린지 시즌 1 - 3진법 뒤집기
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 * 
 */
import java.util.ArrayList;

public class Ternary {

	public static void main(String[] args) {
		int n = 125;
		
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int answer = 0;
        ArrayList<Integer> remains = new ArrayList<Integer>();
        
        while(n != 0) {
            remains.add(n % 3);
            n /= 3;
        }
        
        int exp = 0;
        
        for(int i = remains.size() - 1; i >= 0; i--) {
            answer += (remains.get(i) * Math.pow(3, exp++));
        }
        
        return answer;
	}
}
