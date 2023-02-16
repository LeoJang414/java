package 생성자;

public class 직원 {
	String name;
	int age;
	char gender;
	
	static int count;
	static double ttlage;
	
	public 직원(String name, int age, char gender) {
		super();
		count++;
		ttlage += age; 
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
