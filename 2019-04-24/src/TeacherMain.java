
public class TeacherMain {
public static void main(String[] args) {
	String []names = {"櫻井","野山","中井"};
	Teacher[] teachers = new Teacher[3];
	
	for (int i =0;i<teachers.length;i++) {
		String n = names[i];
		Teacher t = new Teacher(n);
		teachers[i]=t;
	}
	
	for(Teacher teacher:teachers) {
		System.out.println(teacher.name+"先生、こんにちは");
	}
	
		/*
		 * Teacher t1= new Teacher(names[0]); Teacher t2= new Teacher(names[1]); Teacher
		 * t3= new Teacher(names[2]); System.out.println(t1.name+"先生こんにちは");
		 * System.out.println(t2.name+"先生こんにちは"); System.out.println(t3.name+"先生こんにちは");
		 */
	
}
}
