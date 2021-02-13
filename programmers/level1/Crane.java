package Crane_doll_draw_game;

/**
 * @author coMkkyu
 * @date 2021. 2. 13.
 * 
 * 2019 카카오 개발자 겨울 인턴십 - 크레인 인형뽑기 게임
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 */

import java.util.Stack;

public class Crane {
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2,},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
	}
	
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
            	/**
            	 * moves[i] - 1 열에 해당하는 행의 값을 0부터 차례로 탐색
            	 * 0이 아닐 경우(비어있지 않은 경우)에만 탐색
            	 */
                if(board[j][moves[i] - 1] != 0) {
                	// 스택이 비어있는 경우에는 스택에 해당 인형을 스택에 push
                    if(stack.empty()) {
                        stack.push(board[j][moves[i] - 1]);
                    } else {
                    	/**
                    	 *  스택에 인형이 존재하는 경우
                    	 *  스택의 맨위에 있는 인형과 크레인이 뽑은 인형을 비교
                    	 *  같은 인형이라면 스택에서 해당 인형을 제외하고 사라진 인형의 개수를 2개 추가
                    	 */
                        if(board[j][moves[i] - 1] == stack.peek()) {
                            stack.pop();
                            answer += 2;
                        } else {
                        	// 서로 다른 인형이라면 스택에 push
                            stack.push(board[j][moves[i] - 1]);
                        }
                    }
                    
                    // 해당 인형이 스택으로 push 되거나 pop되어서 사라졌기 때문에
                    // 다음 탐색에 지장을 주지않기 위해 해당 board의 값을 0으로 해준다.
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}
