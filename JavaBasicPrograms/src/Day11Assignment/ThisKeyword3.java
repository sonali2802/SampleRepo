package Day11Assignment;

public class ThisKeyword3 {
     int variable=95;
	public static void main(String[] args) {
		ThisKeyword3 obj=new ThisKeyword3();
	     obj.method(5);
	     obj.method();
	System.out.println("value of instant variable: "+obj.variable);
	}
	void method(int variable) {
		System.out.println("value of local variable: "+variable);
         variable=80;
 		System.out.println("value of local variable: "+variable);
 		System.out.println("value of instant variable: "+this.variable);
              this.variable=variable;
       		System.out.println("value of local variable: "+variable);
     		System.out.println("value of instant variable: "+this.variable);
	}
	void method() {
	         int variable=25;
	     		System.out.println("value of instant variable: "+this.variable);
             this.variable=variable;
        		System.out.println("value of local variable: "+variable);
        		System.out.println("value of local variable: "+variable);
	     		System.out.println("value of instant variable: "+this.variable);

	
	
	}

}
