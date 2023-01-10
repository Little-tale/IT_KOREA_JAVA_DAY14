package casting2;

public class Dog extends Animal
{	
	
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void crying() {
		// TODO Auto-generated method stub
		//super.crying();
		System.out.println("멍멍");
	}
	
	void walk()
	{
		System.out.println("산책가장 ㅠㅠ");
	}
	
}
