package skill_tree;

/**
 * 
 * @author COMKKYU
 * @date 2021. 3. 1
 * 
 * Summer/Winter Coding(~2018) - 스킬트리
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 *
 */
public class SkillTree {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {
				"BACDE",
				"CBADF",
				"AECB",
				"BDA"
		};
		
		System.out.println(solution(skill, skill_trees));
	}

	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i = 0; i < skill_trees.length; i++) {
            String tree = skill_trees[i];
            int len = tree.length();
            
            for(int j = 0; j < len; j++) {
            	String one = String.valueOf(tree.charAt(j));
            	
            	// 선행 스킬 순서(skill)에 없는 스킬들을 제거.
                if(!skill.contains(String.valueOf(one))) {
                    skill_trees[i] = skill_trees[i].replace(one, "");
                }
            }
            
            // 선행 스킬들만 skill_trees[i]에 남아있는 상태
            // C, CB, CBD인 경우 0 반환
            // 선행 스킬이 아닌 스킬들을 구성된 경우 빈문자열이라 시작위치인 0 반환
            // 나머지 경우 -1 반환
            if(skill.indexOf(skill_trees[i]) == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
