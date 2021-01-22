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
		// ���� 1
		for (int i = 0; i < array.length; i++) {
			// array�� value ���� index �� �ϴ� counting �迭 �� 1 ����
			counting[array[i]]++;
		}
		
		// ���� 2
		for (int i = 1; i < counting.length; i++) {
			// ���� �� ���ֱ�
			counting[i] += counting[i-1];
		}
		
		// ���� 3
		for (int i = array.length - 1; i >= 0; i--) {
			/**
			 *  i ��° ���Ҹ� �ε����� �ϴ� counting �迭�� 1 ���ҽ�Ų ��
			 *  counting �迭�� ���� �ε����� �Ͽ� result�� number ���� �����Ѵ�.
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
	 *  ���� 1, ���� 2, ���� 3 �� �Ʒ��� ���� �� �����ϰ� ǥ���� �� �ִ�.
	 *  main �Լ��� ��� �񱳸� ���� array �� result �迭�� ����������, ���� ������ �˰��ְ�
	 *  ����¸� �ϴ� ���̶�� array �� 0 ��° ���� �Է��ϴ°� �ƴ϶� counting ó�� �Է� ���ڸ���
	 *  �ش� ���� array �迭�� �ε����� ����Ͽ� array �迭 ���� ������Ų ��, ���� �� �κ��� skip �ϰ�
	 *  �ٷ� array[0] ���� �ش� �ε����� ���� 0�� �� �� ���� �ε����� ������ָ� �ȴ�.
	 *  
	 *  @param size �Է°����� ���� ����
	 *  @param numbers �Է¹��� �� ���
	 */
	static void countingSort(int size, int[] numbers) {
		
		int[] arr = new int[size+1]; // ���� ����
		
		for (int i = 0; i < arr.length; i++) { // ������ ũ��(�Է¹��� ������ ����)
			arr[numbers[i]]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			while(arr[i] > 0) { // arr[i] ���� 0���� Ŭ ���
				System.out.println(i);
				arr[i]--;
			}
		}
	}
}
