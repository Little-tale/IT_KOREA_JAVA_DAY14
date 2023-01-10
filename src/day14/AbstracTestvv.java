package day14;

public class AbstracTestvv {

	public static void main(String[] args) {
//		Class a = new ClassA; // 추상 클래스는 객체 생성 불가
		// 단, 메소드 오버라이딩 구현후 상속 관계가 형성되면 가능
		
		ClassA a= new ClassB();
		a.method1();
		a.method2();
		
		ClassB b = new ClassB();
		b.method1();
		b.method2();

	}

}
