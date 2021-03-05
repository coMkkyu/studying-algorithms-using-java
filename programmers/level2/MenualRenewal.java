package menual_renewal;

/**
 * 
 * @author COMKKYU
 * @date 2021. 3. 5
 * 
 * 2021 KAKAO BLIND RECRUITMENT - 메뉴 리뉴얼
 * https://programmers.co.kr/learn/courses/30/lessons/72411
 * 
 */
import java.util.*;

public class MenualRenewal {
	static List<Map<String, Integer>> FoodMaps = new ArrayList<>();
	static int[] maxCount = new int[11];

	public static void main(String[] args) {
		String[] orders = { "ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD" };
		int[] course = { 2, 3, 5 };
		
		for (String result : solution(orders, course)) {
			System.out.println(result);
		}
	}

    
    public static void comb(char[] str, int pos, StringBuilder candidate) {
        if (pos >= str.length) {
            int len = candidate.length();
            if (len >= 2) {
                int cnt = FoodMaps.get(len).getOrDefault(candidate.toString(), 0) + 1;
                FoodMaps.get(len).put(candidate.toString(), cnt);
                maxCount[len] = Math.max(maxCount[len], cnt);
            }
            // 조합을 Map에 추가하고 재귀 종료
            return;
        }
        
        // 다음 문자 선택 O
        comb(str, pos + 1, candidate.append(str[pos]));
        // 선택 전으로 초기화
        candidate.setLength(candidate.length() - 1);
        // 다음 문자 선택 X
        comb(str, pos + 1, candidate);
    }
    
    public static String[] solution(String[] orders, int[] course) {
        // FoodMaps list는 HashMap<String, Integer>를 원소로 가진다.
        for (int i = 0; i <= 10; i++)
            FoodMaps.add(new HashMap<String, Integer>());
        
        // 므든 주문목록에 대해서 가능한 조합들을 FoodMaps에 저장
        for (String str : orders) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            comb(arr, 0, new StringBuilder());
        }
        
        List<String> list = new ArrayList<>();
        for (int len : course) {
            for (Map.Entry<String, Integer> entry : FoodMaps.get(len).entrySet()) {
            	// entry.getValue() : 조합 개수 (최소 2명 이상이어야 함)
            	// maxCount[len] : len 개의 단품요리로 구성된 코스요리 조합 중 가장많은 개수
                if (entry.getValue() >= 2 && entry.getValue() == maxCount[len]) {
                    list.add(entry.getKey());
                }
            }
        }
        
        Collections.sort(list);
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
