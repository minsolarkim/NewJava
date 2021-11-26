package thread;
//	Thread �켱 ���� ����
public class PriorityThread extends Thread {
	
	//Field
	private String name;
	
	//Constructor
	public PriorityThread() {
		// TODO Auto-generated constructor stub
	}
	
	public PriorityThread(String name) {
//		super();
		this.name = name;
	}
	
	//Method
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(name + " ���");
		}
	}
	public String getThreadName() {
		return name;
	}
	
	//Main method
	public static void main(String[] args) {
		PriorityThread p1, p2, p3;
		p1 = new PriorityThread("1.�켱���� MAX");
		p2 = new PriorityThread("2.�켱���� NORM");
		p3 = new PriorityThread("3.�켱���� MIN");
		
		p1.setPriority(Thread.MAX_PRIORITY);
		//p1.setPriority(8);
		p1.setPriority(Thread.NORM_PRIORITY);
		p1.setPriority(Thread.MIN_PRIORITY);
		
		//��¼����� Ȯ������. (p1, p2, p3 or p3, p2, p1) ????
		p3.start();
		p2.start();
		p1.start();
		System.out.println(":: Main Thread 1EA + Thread 3EA");
		
		System.out.println("::"+p1.getThreadName()+" thread�� �켱 ���� : " + p1.getPriority());
		System.out.println("::"+p2.getThreadName()+" thread�� �켱 ���� : " + p2.getPriority());
		System.out.println("::"+p3.getThreadName()+" thread�� �켱 ���� : " + p3.getPriority());
	}

	

}