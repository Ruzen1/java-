
public class HelloFor {
public static void main(String[] args) {
     for(int i =1;i<10;i++) {
    	
    	 for(int j=1;j<10;j++) {
    		 System.out.printf("%-4s%02d  ",j+"*"+i+"=",i*j);    		 
    	 }
    	 System.out.println("");
     }
}
}