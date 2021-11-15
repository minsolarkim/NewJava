public abstract class  
{
	//Field
	private String name;

	//Constructor
	public Bank(){
	}
	public Back(String name){
		this.name = name;
	}

	//Method
	//은행명을 출력하는 display method를 추상 Method로 정의
	public abstract void display();

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

}
