package day14;

abstract class ClassA
{
// 메소드 
	//추상
	abstract void method1();
	
	void method2()
	{
		System.out.println("메소드2 실행중");
	}
}


class ClassB extends ClassA
{

	//메소드 재정의 오버라이딩
	
	
	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("메소드 오버라이딩 method1()!!");
	}
	
}