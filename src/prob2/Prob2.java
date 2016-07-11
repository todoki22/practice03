package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		final int[] UNITS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "금액:" );
		int money = scanner.nextInt();
		
		for( int unit : UNITS ) {
			int count = money / unit;
			money -= ( unit*count );
			System.out.println( unit + "원 : " + count + "개" );
		}
		
		scanner.close();
	}
}

