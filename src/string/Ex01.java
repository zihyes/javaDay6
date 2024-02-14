package string;

public class Ex01 {

	public static void main(String[] args) {
		String str;
		String str1 = new String();
		String str2 = "test";
		String str3 = new String("test init");
		System.out.println("str3 : " + str3);
		String s1 = str3.toUpperCase();
		System.out.println("s1 : " + s1); // uppercase : 해당문자를 전부 다 대문자로 변환
		String s2 = s1.toLowerCase();
		System.out.println("s2 : " + s2); // losercase : 소문자로 변환

		str3 = "Java"; // java, Java
		//if(str3.equals("java")) {
		if( str3.toLowerCase().equals("java")){// 이럴때 upper 나 lowecase 사용하면 저장을 어떻게 했든지 비교 가능
			System.out.println("수강 과목은 자바군요");
		}else {
			System.out.println("다르다!!!");
		}
	}

}
