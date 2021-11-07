public class Methods {
	public static void main(String[] args) {
		Person ming = new Person();
		ming.setName("a test name");
		ming.setAge(18);
		System.out.println(ming.getName() + ", " + ming.getAge());
	}
}

class Person {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if (age < 0 || age > 99) {
			throw new IllegalArgumentException("invalid age value");
		}
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
}
