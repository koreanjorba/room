
public class Person_Ex {
	public static void main(String[] args) {
		//public인 Person은 객체 통합 접근 가능
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	
//		final 필드의 값 변경 불가
//		p1.nation = "usa";
//		p1.ssn = "1234";
		
		p1.name = "을지문덕";
	}
}
