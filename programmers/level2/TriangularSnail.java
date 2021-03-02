package triangular_snail;

/**
 * 
 * @author COMKKYU
 * @date 2021. 3. 2
 * 
 * 월간 코드 챌린지 시즌 1 - 삼각 달팽이
 * https://programmers.co.kr/learn/courses/30/lessons/68645
 *
 */
public class TriangularSnail {

	public static void main(String[] args) {
		int n = 4;
		
		for(int i : solution(n)) {
			System.out.println(i);
		}
	}

	public static int[] solution(int n) {
        int[][] arr = new int[n][n];
        int[] answer = new int[n*(n+1) / 2];
        int row = -1;
        int col = 0;
        int num = 1;
        int idx = 0;
        
        while(true) {
            
            // 아래 방향
            for(int i = 0; i < n; i++) {
                row++;
                arr[row][col] = num++;
            }
            n--;
            if(n == 0) break;
            
            // 오른쪽 방향
            for(int i = 0; i < n; i++) {
                col++;
                arr[row][col] = num++;
            }
            n--;
            if(n == 0) break;
            
            // 대각선 방향
            for(int i = 0; i < n; i++) {
                row--;
                col--;
                arr[row][col] = num++;
            }
            n--;
            if(n == 0) break;
        }
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0) break;
                answer[idx] = arr[i][j];
                idx++;
            }
        }
        
        return answer;
    }
}
