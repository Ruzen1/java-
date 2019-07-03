
public class SampleMain {
public static void main(String[] args) {
	Animal [] animals = new Animal[12];
	animals[0]=new Cat();
	animals[1]=new Dog();
	
	for (int i=2;i<animals.length;i++) {
		animals[i]=new Cat();
	}
	
	for (int i=2;i<animals.length;i++) {
		animals[i].say();
	}
	
	
	
}
}
