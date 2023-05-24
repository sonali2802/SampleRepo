package Day6EAssignment;

public class ForLoop6 {

	public static void main(String[] args) {
               for(int i=0;i<3;i++) {
	System.out.println("Hello,i:"+i);
               }         
	for(int i=0;i<3;++i) {	
		System.out.println("Hello,i:"+i);
		for(int j=0;j<2;j++) {
    System.out.println("\thi j:"+j);
               }
	
               }
	System.out.println("Hello ");
	for(int i=0;i<3;++i) {
		System.out.println("Hello,i:"+i);
		for(int j=0;j<2;j++) {
    System.out.println("\thi j:"+j);
	for(int k=0;k<2;k++) {
	System.out.println("\t\t bye k:"+k);
	}
	
	}
	}	
	
	System.out.println("Inifinite Loop");
	for(int i=1;i>=0;i++) {
	  if((i%2==0)) {
	System.out.println(i);
	  }
	}
	}
}
