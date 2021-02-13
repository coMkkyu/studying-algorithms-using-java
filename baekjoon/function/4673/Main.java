package _4673;

public class Main {

	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n <= 10000) {
				check[n] = true;
			}
		}
		
		for (int i = 1; i < check.length; i++) {
			if(!check[i])
				System.out.println(i);
		}
	}
	
	public static int d(int n) {
		int result = n;
		
		while(n != 0) {
			result += (n % 10);
			n = n / 10;
		}
		
		return result;
	}

}
