package Crane_doll_draw_game;

/**
 * @author coMkkyu
 * @date 2021. 2. 13.
 * 
 * 2019 īī�� ������ �ܿ� ���Ͻ� - ũ���� �����̱� ����
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
            	 * moves[i] - 1 ���� �ش��ϴ� ���� ���� 0���� ���ʷ� Ž��
            	 * 0�� �ƴ� ���(������� ���� ���)���� Ž��
            	 */
                if(board[j][moves[i] - 1] != 0) {
                	// ������ ����ִ� ��쿡�� ���ÿ� �ش� ������ ���ÿ� push
                    if(stack.empty()) {
                        stack.push(board[j][moves[i] - 1]);
                    } else {
                    	/**
                    	 *  ���ÿ� ������ �����ϴ� ���
                    	 *  ������ ������ �ִ� ������ ũ������ ���� ������ ��
                    	 *  ���� �����̶�� ���ÿ��� �ش� ������ �����ϰ� ����� ������ ������ 2�� �߰�
                    	 */
                        if(board[j][moves[i] - 1] == stack.peek()) {
                            stack.pop();
                            answer += 2;
                        } else {
                        	// ���� �ٸ� �����̶�� ���ÿ� push
                            stack.push(board[j][moves[i] - 1]);
                        }
                    }
                    
                    // �ش� ������ �������� push �ǰų� pop�Ǿ ������� ������
                    // ���� Ž���� ������ �����ʱ� ���� �ش� board�� ���� 0���� ���ش�.
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}
