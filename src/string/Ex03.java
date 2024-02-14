package string;

public class Ex03 {

	public static void main(String[] args) {
		String str = "test      "; // 실수로 공백이 들어가는 경우
		System.out.println("str : " + str);
		System.out.println (str.equals("test") );
		
		String result = str.trim(); // trim이용하면 양쪽 공백을 없앤다.
		System.out.println( "result : " + result);
		System.out.println(result.equals("test") );
		
		String addr = "05214 노원구 동일로4567";
		System.out.println(addr);
		
		String[] split = addr.split(" ");// 각각의 값들을 배열형태로 쪼개준다., 괄호안에 어떤걸 기준으로 자를건지/공백을 기준으로 배열로 잘라주세요!
		for(int i = 0; i < split.length; i++) {
			System.out.println( i + "." + split[i]);
		}
		
		String phone = "010-1234-1234"; // replace : 치환한다.
		String rep = phone.replace("-", ""); // ,앞 문자를 ,뒤 문자로 치환
		System.out.println("rep : " + rep);
		
		phone = "1234";
		int num = Integer.parseInt( phone );
		System.out.println( num + 100 ); // 문자열 형태의 숫자 => 숫자로 변경
		System.out.println( phone + 100 ); // 문자연산
		String s = num + ""; //num값을 숫자로 연산
		System.out.println( s + 100);

	}

}
