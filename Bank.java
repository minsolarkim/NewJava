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
	//������� ����ϴ� display method�� �߻� Method�� ����
	public abstract void display();

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

}
