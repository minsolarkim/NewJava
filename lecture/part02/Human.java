//package jb04.part02;

/*
	File Name : Human.java 
	ㅇ추상화수준이 높은, 일반적인 사항을 모델링 클래스
*/
public class Human{

	///Field	
	String name;
	int age;

	///Constructor
	public Human(){
		System.out.println("Human class default Constructor");
	}
	public Human(String str){
		System.out.println("Human class의 name을 받는 Constructor");
		name = str;
	}

	///Method
	//setter method
	public void setName(String str){
        name =str;
    }
	public void setAge (int b){
        age = b;
    }

    //getter method
	public String getName(){
        return name;
	}
	public int getAge (){
		return age;
	}

}//end of class