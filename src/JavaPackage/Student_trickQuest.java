package JavaPackage;

public class Student_trickQuest {
			//This is from video 10 with a Good trick question. Watch video (01:0	5)
	String name;			//1.Declare variables
	int age;
	
	//2. create constructor using (right click+source):	
	public Student_trickQuest(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public static void main(String[] args) {
		
		Student_trickQuest s1 = new Student_trickQuest("Anu", 40);
		Student_trickQuest s2 = new Student_trickQuest("Ali", 45);
		Student_trickQuest s3 = new Student_trickQuest("Puja", 50);

		System.out.println(s1.name + " " + s1.age);   	
		System.out.println(s2.name + " " + s2.age);		//(Anu 40, Ali 45, Puja 50)
		System.out.println(s3.name + " " + s3.age);		
		
		s1 = s2;
		
		System.out.println(s1.name + " " + s1.age);
		System.out.println(s2.name + " " + s2.age);		//(Ali 45, Ali 45, Puja 50)
		System.out.println(s3.name + " " + s3.age);
		 
		s2 = s3;
		
		System.out.println(s1.name + " " + s1.age);
		System.out.println(s2.name + " " + s2.age);		//(Ali 45, Puja 50, Puja 50)		
		System.out.println(s3.name + " " + s3.age);
		
		
	}

}
