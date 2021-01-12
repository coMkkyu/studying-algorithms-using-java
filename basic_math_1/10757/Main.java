package _10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	/**
	 *  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 *  자바에서는 큰 수는 BigInteger 클래스를 활용한다.
	 *  BigInteger는 문자열 형태로 이루어져 있어 숫자의 범위가 무한하기에 어떠한 숫자이든지 담을 수 있다.
	 *  문자열이기 때문에 사칙연산이 안되므로 BigInteger 클래스 내부에 있는 메서드를 사용해야 한다.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		System.out.println(A.add(B));
	}

}
