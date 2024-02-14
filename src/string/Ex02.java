package string;

public class Ex02 {

	public static void main(String[] args) {
		String str = "test"; // string도 index기능 사용 가능 => charAt(): 문자 하나 표현
		System.out.println("length : " + str.length()); // 저장되어 있는 길이
		System.out.println("charAt(1)" + str.charAt(1));
		
		System.out.println( str.charAt(0) == 't'); //해당 값 비교시 등호2개(==)로 비교
		System.out.println( str.charAt(0) != 't');
		System.out.println( str.equals("aaaa") ); //문자열은 equals 이용 비교
		
		String jumin = "9aa514";
		if( jumin.length() == 6) {
			for(int i = 0; i < jumin.length(); i++) {
				if(jumin.charAt(i) < '0' || jumin.charAt(i) > '9') {
					System.out.println("숫자를 입력하세요");
					break;
				}
			}
		}else {
			System.out.println("길이가 잘못 됐음!!!");
		}	
			
//		String jumin = "9aa514";
//		if( jumin.length() == 6) {
//			int i=0;
//			for(int i = 0; i < jumin.length(); i++) {
//				if(jumin.charAt(i) < '0' || jumin.charAt(i) > '9') {
//					System.out.println("숫자를 입력하세요");
//					break;
//				}
//			}
//			if( i ==jumin.length() ) {
//				System.out.println("뒷자리 주민번호를 입력하세요");
//			}
//		}else {
//			System.out.println("길이가 잘못 됐음!!!");
			
			System.out.println("------------------");
			int i = 0;
			for( ; i < 5; i++) {
				if(i == 4) {
					break;
				}
				
			}
			System.out.println("i : " + i);
	}

}
