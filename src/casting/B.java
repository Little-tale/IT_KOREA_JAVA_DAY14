package casting;

public class B extends A{
	
	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();
		
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		
		A aa = new B();
		B bb = new B();
		
		System.out.println(aa instanceof B);
		System.out.println(bb instanceof B);
	}

}
