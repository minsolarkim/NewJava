
/*
	1. OOP : Message
	2. OOPL : Method
	- 객체간의 행위를 정의하는 Method 문법
	- OOP에서 Message(Method)란 객체간 data를 전달 또는 받을 수 있는 수단.
	- OOP는 객체간 Message 전송으로 필요한 데이터를 넘기거나 결과 데이타를 받을 수 있다.
	- OOP는 객체과 객체간 통신은 method 호출
*/
class MethodSyntax
{
	//Field
	String name = "홍길동";
	String add = "한양";

	//Method
	//==> 브라우저를 켜는 행위 정의
	public void browerOn(){
		System.out.println("brower를 켜다");
	}

	//==> 작업을 하고 작업유무를 boolean type으로 return 하는 행위
	public boolean documentWork(){
		System.out.println("document작업을 하고 작업완성 유무를 boolean return");
		return true;
	}

	//==> 두 개의 정수를 받아 합을 return  하는 행위
	public int sum(int i, int j){
		System.out.println("<<"+i+">> 와 <<"+j+">>값을 받아 합 return");
		return(i+j);
	}

	//==> 이름을 return하는 행위
	public String getName(){
		System.out.println("이름을 전달합니다.");
		return name;
	}

	//==> 주소를 return하는 행위
	public String getAdd(){
		System.out.println("주소을 전달합니다.");
		return add;
	}

	//==> 이름, 주소 두가지 정보(상태값)을 Array DataType return 하는 행위
	public String[] getAllInformation(){
		String[] str = { name, add };
		return str;
	}

}//end of class
