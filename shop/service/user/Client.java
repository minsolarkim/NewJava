package shop.service.user;

public class Client {
	
	//Field
	public String name;
	protected int age;
	String job;
	private int salary;
	boolean gender;
	public static final String nationality = "¥Î«—πŒ±π";
	

	public Client() {
		// TODO Auto-generated constructor stub
	}


	public Client(String name, int age, String job, int salary, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.salary = salary;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Client [name=" + name + ", age=" + age + ", job=" + job + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}
	
	

}
