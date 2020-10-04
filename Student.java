package Encapsulation;

public class Student {
	
	private int age;
	private String name;
	private float percentage;
	
	
	public int getAge() {
		return age;
		
	}
	
	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
		System.out.println(percentage);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
		System.out.println(name);
	}

	public void setAge(int age) {
		if(age > 20) {
			System.out.println("You are too old");
		}else {
		this.age = age;
		System.out.println(age);
	}
	}

}
