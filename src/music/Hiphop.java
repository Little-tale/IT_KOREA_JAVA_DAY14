package music;

public class Hiphop extends Music
{
//오버 라이딩
	@Override
	void mode() {
		System.out.println("힙합모드");
	}
	void onlyHipHop()
	{
		System.out.println("only HipHop MODE");
	}
}
