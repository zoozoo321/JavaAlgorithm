package chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumWhile {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = Integer.parseInt(stdIn.readLine());
		
		int sum = 0;	// 합
		int i = 1;
		
		while(i <= n) {	// i가 n 이하면 반복합니다.
			sum += i;	// sum에 i를 더합니다.
			i++;		// i값을 1만큼 증가시킵니다.
			System.out.println("i값 : " + i);
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
