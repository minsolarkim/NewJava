package shop.service.user.test;

import shop.service.user.Client;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("홍길동", 111, "의적", 111, false);
		
		System.out.println("이름 : " + client.getName());
		System.out.println("나이 : " + client.getAge());
		
		System.out.println(client); //<== client.toString() 
		
	}

}
