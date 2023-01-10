package music;

public class CastingTesk {

	public static void main(String[] args)
	{
		//음악재생 프록그램
		// 부모는 뮤직 클래스
		// 구현하지 않은 mode 메소드 만들기
		
		//자식 Ballad,HipHop,Rock 클래스
		
		//"발라드모드" 출력하는 mode 메소드
		//"only ballad실행" 출력하는 온리발라드 메소드
		
		//"힙합모드" 출력하는 mode 메소드
		//"only HIPHOP실행" 출력하는 온리HIPHOP 메소드
		
		//"락 모드" 출력하는 mode 메소드
		//"only ballad실행" 출력하는 온리발라드 메소드
		
		
		
		//객체 생성
		CastingTesk ct = new CastingTesk();
		Music musicOfHipHop = new Hiphop();

		musicOfHipHop.musicStart();
		musicOfHipHop.mode();
		((Hiphop)musicOfHipHop).onlyHipHop();
		
		
		check(musicOfHipHop); // 스태틱이 아니니 앞에 ct붙이
		
	}
	static void check (Music music)
	{
		if(music instanceof Ballad)
		{
			Ballad ballad = (Ballad)music;
			ballad.mode();
			ballad.onlyBallad();
		}
		else if(music instanceof Rock)
		{
			Rock rock = (Rock)music;
			rock.mode();
			rock.onlyRock();
		}
		else if(music instanceof Hiphop)
		{
			Hiphop hiphop = new Hiphop();
			hiphop.mode();
			hiphop.onlyHipHop();
			
		}
	}
}
