package years2016;

/**
 * 
 * @author COMKKYU
 * @date 2021. 2. 17
 * 
 * 연습문제 - 2016년
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 */
public class Years2016 {

	public static void main(String[] args) {
		int a = 5, b = 24;
		
		System.out.println(solution(a, b));
	}
	
	public static String solution(int a, int b) {
        String answer = "";
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int total_day = 0;
        
        for(int month = 1; month < a; month++) {
            switch(month) {
                case 2:
                    total_day += 29;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    total_day += 30;
                    break;
                default:
                    total_day += 31;
                    break;
            }
        }
        
        total_day += b - 1;
        
        answer = days[total_day % 7];
        
        return answer;
    }

}
