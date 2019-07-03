
public class Zoo {

	public static void main(String[] args) {
	      Animal[] animals = new Animal[3];
	      animals[0]= new Neko();
	      animals[1]= new Dog();
	      animals[2]= new Lion();
	      
	      for (int i = 0;i<animals.length;i++) {
	    	  animals[i].say();
	      }
		}
}
