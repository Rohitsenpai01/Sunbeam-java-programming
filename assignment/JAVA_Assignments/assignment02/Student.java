package assignment02;

public class Student implements Comparable<Student> {

	private int rollno;
	private String name;
	private float percentage;

	public Student(int rollno, String name, float percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public float getPercentage() {
		return percentage;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.rollno, o.rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return this.rollno == other.rollno;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(rollno);
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
}
