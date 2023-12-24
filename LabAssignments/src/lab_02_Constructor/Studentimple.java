package lab_02_Constructor;

public class Studentimple {

	public static void main(String[] args) {

		Student1 s1 = new Student1(101, "Nita", "java", 75);
		s1.showdata();

		Student1 s2 = new Student1();

		s2.readdata();
		s2.showdata();
	}

}