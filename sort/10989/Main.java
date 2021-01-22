package _10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		int[] counting = new int[10000001];
		int[] result = new int[N];
		
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		// Counting Sort
		// 과정 1
		for (int i = 0; i < array.length; i++) {
			// array의 value 값을 index 로 하는 counting 배열 값 1 증가
			counting[array[i]]++;
		}
		
		// 과정 2
		for (int i = 1; i < counting.length; i++) {
			// 누적 합 해주기
			counting[i] += counting[i-1];
		}
		
		// 과정 3
		for (int i = array.length - 1; i >= 0; i--) {
			/**
			 *  i 번째 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
			 *  counting 배열의 값을 인덱스로 하여 result에 number 값을 저장한다.
			 */
			int number = array[i];
			counting[number]--;
			result[counting[number]] = number;
		}
		
		for (int number : result) {
			sb.append(number).append("\n");
		}
		
		System.out.println(sb);
	}
	
	/**
	 *  과정 1, 과정 2, 과정 3 을 아래와 같이 더 간단하게 표현할 수 있다.
	 *  main 함수의 경우 비교를 위해 array 와 result 배열이 존재했지만, 수의 범위를 알고있고
	 *  입출력만 하는 것이라면 array 에 0 번째 부터 입력하는게 아니라 counting 처럼 입력 받자마자
	 *  해당 값을 array 배열의 인덱스를 사용하여 array 배열 값을 증가시킨 뒤, 누적 합 부분을 skip 하고
	 *  바로 array[0] 부터 해당 인덱스의 값이 0이 될 때 까지 인덱스를 출력해주면 된다.
	 *  
	 *  @param size 입력가능한 수의 범위
	 *  @param numbers 입력받은 수 목록
	 */
	static void countingSort(int size, int[] numbers) {
		
		int[] arr = new int[size+1]; // 수의 범위
		
		for (int i = 0; i < arr.length; i++) { // 수열의 크기(입력받은 숫자의 개수)
			arr[numbers[i]]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			while(arr[i] > 0) { // arr[i] 값이 0보다 클 경우
				System.out.println(i);
				arr[i]--;
			}
		}
	}
}
