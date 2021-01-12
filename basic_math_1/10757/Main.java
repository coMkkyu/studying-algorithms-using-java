package _10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 *  �ڹٿ����� ū ���� BigInteger Ŭ������ Ȱ���Ѵ�.
	 *  BigInteger�� ���ڿ� ���·� �̷���� �־� ������ ������ �����ϱ⿡ ��� �����̵��� ���� �� �ִ�.
	 *  ���ڿ��̱� ������ ��Ģ������ �ȵǹǷ� BigInteger Ŭ���� ���ο� �ִ� �޼��带 ����ؾ� �Ѵ�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		System.out.println(A.add(B));
	}

}
