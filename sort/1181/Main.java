package _1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Set<String> words = new HashSet<String>();
		
		for (int i = 0; i < N; i++) {
			words.add(br.readLine());
		}
		
		List<String> wordList = new ArrayList<String>(words);
		
		Collections.sort(wordList, (w1, w2) -> {
			int w1_len = w1.length();
			int w2_len = w2.length();
			
			if(w1_len == w2_len) return w1.compareTo(w2);
			else return w1_len - w2_len;
		});
		
		for (String word : wordList) {
			sb.append(word).append("\n");
		}
		
		System.out.println(sb);
	}
}
