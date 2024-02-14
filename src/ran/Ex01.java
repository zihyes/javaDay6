package ran;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println( Math.random() ); // 0.0 ~ 0.999 사이의 값 도출
		}
		System.out.println("--------------------");
		for(int i = 0; i < 5; i++) {
			double dou = Math.random() * 3; // 0~2까지 3개의 숫자
		System.out.println( (int)dou );
		}
		System.out.println("====================");
		Random r = new Random(); // Random 유틸 사용
		for(int i = 0; i < 5; i++) {
			int num = r.nextInt(3); // 0~2
			System.out.println( num );
		}
	}

}
