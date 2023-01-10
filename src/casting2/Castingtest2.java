package casting2;

public class Castingtest2 {

	public static void main(String[] args)
	{
		// 부모타입으로 객체 생성
//		Animal animal = new Animal();
//		animal.crying();
		
		// 업캐스팅
		//Animal animal = new Dog();	
		//animal.crying();
		
		
		//1. 같은 메소드가 부모에도 있고 자식에도 있는 경우 (오버라이딩)
		//   업캐슽잉을 해도 오버라이딩 된 메소드가 실행된다.
		
		// 2. 메소드가 부모에는 없고 자식에서 추가된 경우
		//    부모에 존재하지 않는 멤버에 접근하여는 경우)
		
		// 자식 클래스 에서 추가한 멤버는 부모타입의 참조변수로는 접근할 수 가 없다.
		
		// 다운캐스팅 진행해야함
		//((Dog)animal).walk();
		
		
		// 생성자 만들기
		
		Dog dog = new Dog("바둑이");
		Cat cat = new Cat("나비");
		
		System.out.println(dog.name);
		System.out.println(cat.name);
		
		System.out.println((new Dog("뽀삐")));
		dog.walk();
		
		//1. 메소드의 매개변수로 여러 타입을 전달 받는 경우
		// 일반적으로는 각각의 타입을 처리하는 메소드를 별도로 만들어야 한다.
		
		
		printText(cat); // 메소드명(객체명)
		printText(dog);
		
		printText2(cat);
		
		trywalk(dog);
		trywalk(cat);
		
		
	}
	//1. 메소드의 매개변수로 여러 타입을 전달 받는 경우
			// 일반적으로는 각각의 타입을 처리하는 메소드를 별도로 만들어야 한다.
	static void printText(Dog dog)
	{
		System.out.println(dog.name + "운다.");
		dog.crying();
	}
	static void printText(Cat cat)
	{
		System.out.println(cat.name + "운다.");
		cat.crying();
	}
	
	//2. 같은부무 클래스가 존재한다면 매개변수를 부모클래스 타입으로 받는다.(업캐스팅)
	// 하나의 메소드에서 매개변수를 부모 타입으로 만들면 여러 자식 타입을 받아 사용이 가능하다.(다형성)
	static void printText2(Animal animal)
	{
		System.out.println(animal.name + " 가 운다!");
		animal.crying();
	}
	
	//3. 만약 부모클래스에 존재하지 않는 멤버에 접근하기 위해서는?
	// Down Casting을 해줘야 한다.
	static void trywalk(Animal animal)
	{
		//매개변수로 받아온 객체의 주소가 Cat타입인지, Dog 타입인지 확인을 해야한다.
		if(animal instanceof Dog)
		{
			//Dog타입이 맞다면 Dog로 다운 캐싕한다.
			((Dog)animal).walk();
		}
		else
		{
			System.out.println("싫어 안가 잘랭~");
		}
		
	}
	
	
	
}
