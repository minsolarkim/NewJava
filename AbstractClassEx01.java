abstract class SmartPhone {

	String call = "전화";
	String sns = "SNS";
	String search = "인터넷 접속";
	String game = "게임";
	String company, name, color, size, weight, price;

	public void purpose() {			//일반 메서드
		System.out.println("사용목적 : " + call + " / " + sns + " / " + search + " / " + game);
	}

	abstract public void spec();	//추상 메서드 : 오버라이딩 필수!
}

	class IPhone extends SmartPhone	{
		public void spec() {		//오버라디이
			company = "애플";
			name = "아이폰7";
			color = "흰색";
			size = "11.94cm";
			weight = "138g";
			price = "37만원";
			System.out.println(company + " / " + name + " / " + color + " / " + size + " / " + weight + " / " + price);
		}
	}


	class Galaxy extends SmartPhone	{
		public void spec() {		//오버라디이
			company = "삼성";
			name = "갤럭시 s7";
			color = "흰색";
			size = "13.97cm";
			weight = "152g";
			price = "45만원";
			System.out.println(company + " / " + name + " / " + color + " / " + size + " / " + weight + " / " + price);
		}
	}

public class AbstractClassEx01 { 
	public static void main(String[] args) 	{
		IPhone ip = new IPhone();
		ip.spec();
		ip.purpose();
		Galaxy gx = new Galaxy();
		gx.spec();
		gx.purpose();


	}
}
