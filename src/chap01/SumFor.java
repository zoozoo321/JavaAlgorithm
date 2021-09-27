package chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumFor {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("임의의 수부터 임의의 수까지의 합을 구합니다.");
		System.out.print("1번째 값 : ");
		int n1 = Integer.parseInt(stdIn.readLine());
		System.out.print("2번째 값 : ");
		int n2 = Integer.parseInt(stdIn.readLine());
		
		System.out.println(n1+"과 "+n2+"사이의 수의 합 : " + sumof(n1,n2));
		
//		int sum = 0;	// 합
		
		/*
		 * for(int i = 1; i <= n; i++) { sum += i; // sum에 i를 더합니다.
		 * 
		 * if(i < n) System.out.print(i + " + "); else System.out.print(i); }
		 * 
		 * System.out.println(" = " + sum);
		 */
		
		// 가우스의 덧셈 (1+n)*(n/2)
		
		/*
		 * sum = (1 + n) * (n / 2);
		 * 
		 * System.out.println("가우스의 덧셈 : 1부터 n까지의 정수의 합 : " + sum);
		 */
		
		// 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
		
		
	}
	
	public static int sumof(int a, int b) {
		
		int sum = 0;
		int big, small = 0;
		
		if(a > b) {
			big = a;
			small = b;
		} else if(b > a) {
			big = b;
			small = a;
		} else {
			return a;
		}
		
		for(int i = small; i <= big; i++) {
			sum += i;
		}
		
		return sum;
	}
}
