//package thread;

public class AfterThreadRunnable implements Runnable {

	//Field
	private String name;
	
	//Constructor	
	public AfterThreadRunnable() {
		// TODO Auto-generated constructor stub
	}
	public AfterThreadRunnable(String name) {
		this.name = name;
	}
	
	//Method
	@Override
	public void run() {
		for(int i=1; i<100; i++) {
			System.out.println(name + " : "+ i);
			
//			sleep() ==> APIȮ��
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
		}
	}
	
	//main method
	public static void main(String[] args) {
		
		System.out.println("����� main start...");
		AfterThreadRunnable bt1 = new AfterThreadRunnable("1��°");
		//Runnable bt1 = new AfterThreadRunnable("1��°");
		//�̷��� ���� ���� (List �˸� Vector ��밡���� �� ó��)
		AfterThreadRunnable bt2 = new AfterThreadRunnable("2��°");
		
		//Thread ������ Ȯ��
		Thread t1 = new Thread(bt1);
		Thread t2 = new Thread(bt2);
		
		t1.start();
		t2.start();
		System.out.println("����� main end....");
		
	}
}
