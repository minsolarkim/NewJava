public class HanmiBank extends Bank implements Deposit, PayOut {

	//Field

	//Constructor
	public HanmiBank(){
	}
	public HanmiBank(String name){
		super(name);
	}

	//Method
	public void display(){
		System.out.println("은행명 : "+ this.getName());
	}
	public void deposit(int money){
		System.out.println(money + "를 입금합니다");
	}
	public void payOut(int money){
		System.out.println(money + "를 출금합니다.");
	}

	//main method
	public static void main(String[] args) {

		HanmiBank hb = new HanmiBank("한미은행");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		//==>interface 내부에 선언된 Field 의미를 이해하자.
		//interface의 field를 확인하고
		System.out.println(Deposit.deposit);	//static의 접근방식은?
		System.out.println(hb.payOut);			//static의 접근방식은?

		//Field의 상태값을 변경해보자.
		//Deposit.deposit = "입금";
		//PayOut.payOut = "출금";
		//==>compile error 발생 interface에 선언되는 변수는 fianl static의 특증을 가짐

	}//end of main
}//end of class

