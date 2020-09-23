
// Java program to demonstrate working of 
// Collections.frequency() 
// for custom defined objects 
import java.util.*;

public class GFG2 {
	public static void main(String[] args) {
		// Let us create a list of Student type
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Ram", 19));
		list.add(new Student("Ashok", 20));
		list.add(new Student("Ram", 19));
		list.add(new Student("Ashok", 19));

		// count the frequency of the word "code"
		System.out.println(
				"The frequency of the Student Ram, 19 is: " + Collections.frequency(list, new Student("Ram", 19)));
	}
}

class Student {
	private String name;
	private int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public boolean equals(Object o) {
		Student s;
		if (!(o instanceof Student)) {
			return false;
		}

		else {
			s = (Student) o;
			if (this.name.equals(s.getName()) && this.age == s.getAge()) {
				return true;
			}
		}
		return false;
	}
}
