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
			
//			sleep() ==> API확인
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
		}
	}
	
	//main method
	public static void main(String[] args) {
		
		System.out.println("여기는 main start...");
		AfterThreadRunnable bt1 = new AfterThreadRunnable("1번째");
		//Runnable bt1 = new AfterThreadRunnable("1번째");
		//이렇게 생성 가능 (List 알면 Vector 사용가능한 것 처럼)
		AfterThreadRunnable bt2 = new AfterThreadRunnable("2번째");
		
		//Thread 생성자 확인
		Thread t1 = new Thread(bt1);
		Thread t2 = new Thread(bt2);
		
		t1.start();
		t2.start();
		System.out.println("여기는 main end....");
		
	}
}
