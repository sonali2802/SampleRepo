package day12.constructors;

public class Constructor5 {
	    int roll;
	    double salary;
	    Constructor5(int r,double s){
	        roll=r;
	        salary=s;
	    }
	    void display() {
	    System.out.println(roll+" "+salary);
	    }
	    public static void main(String[] args) {
	     Constructor5 c1= new Constructor5(101,2590.46);
        	c1.display();
        	Constructor5 c2= new Constructor5(201,4389.72);
        	c2.display();
        	Constructor5 c3= new Constructor5(10,204.60);
        	c3.display();
	
	
	
	
	
	
	
	
	

	}

}
