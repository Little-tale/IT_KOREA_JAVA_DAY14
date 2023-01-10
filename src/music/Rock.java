package music;

public class Rock extends Music
{
	
	
	// 오버라이딩 : 부모 메소드 재정의
	@Override
	void mode()
	{
		System.out.println("Rock Mode on");
	}

	void onlyRock()
	{
		System.out.println("Only Rock Mode On");
	}
	
	
}
