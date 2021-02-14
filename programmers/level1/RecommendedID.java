package Recommend_new_ID;

/**
 * @author coMkkyu
 * @date 2021. 2. 14
 * 
 * 2021 KAKAO BLIND RECRUITMENT - �ű� ���̵� ��õ
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 */
public class RecommendedId {

	public static void main(String[] args) {
		String[] arr = {
			"...!@BaT#*..y.abcdefghijklm",
			"z-+.^.",
			"=.=",
			"123_.def",
			"abcdefghijklmn.p"
		};
		
		for (String s : arr) {
			System.out.println(solution(s));
		}
	}
	
	public static String solution(String new_id) {
        String answer = "";
        String recommended_id = "";
        
        // #1. �ҹ��ڷ� ġȯ
        new_id = new_id.toLowerCase();
        
        // #2. ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���� ����
        for(int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if('a' <= c && c <= 'z') {
                recommended_id += c;
            } else if('0' <= c && c <= '9') {
                recommended_id += c;
            } else if(c == '-' || c == '_' || c == '.') {
                recommended_id += c;
            }
        }
        
        // #3. ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ�� ġȯ
        for(int i = 0; i < recommended_id.length(); i++) {
            if(recommended_id.charAt(i) == '.') {
                int next = i + 1;
                
                while(next != recommended_id.length() && recommended_id.charAt(next) == '.') {
                    next++;
                }
                
                if(next - i > 1) {
                    recommended_id = recommended_id.replace(recommended_id.substring(i, next), ".");
                }
            }
        }
        
        // #4. ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
        if(recommended_id.charAt(0) == '.') {
            recommended_id = recommended_id.substring(1);
        } else if(recommended_id.charAt(recommended_id.length() - 1) == '.') {
            recommended_id = recommended_id.substring(0, recommended_id.length() - 1);
        }
        
        // #5. �� ���ڿ��̶�� "a"�� ����
        if(recommended_id.length() == 0) {
            recommended_id = "a";
        }
        
        // #6. ���̰� 16�� �̻��̸� ù 15���� ���ڸ� ������ ������ ���ڸ� ��� ����
        // ���� �� ��ħǥ(.)�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ����
        if(recommended_id.length() >= 16) {
            recommended_id = recommended_id.substring(0, 15);
        }
        if(recommended_id.charAt(recommended_id.length() - 1) == '.') {
            recommended_id = recommended_id.substring(0, recommended_id.length() - 1);
        }
        
        // #7. ���̰� 2�� ���϶��, ������ ���ڸ� ���̰� 3�� �ɶ� ���� �ݺ��ؼ� �߰�
        if(recommended_id.length() <= 2) {
            char c = recommended_id.charAt(recommended_id.length() - 1);
            while(recommended_id.length() != 3) {
                recommended_id += c;
            }
        }
        
        answer = recommended_id;
        
        return answer;
    }

}
