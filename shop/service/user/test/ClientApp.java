package shop.service.user.test;

import shop.service.user.Client;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("ȫ�浿", 111, "����", 111, false);
		
		System.out.println("�̸� : " + client.getName());
		System.out.println("���� : " + client.getAge());
		
		System.out.println(client); //<== client.toString() 
		
	}

}