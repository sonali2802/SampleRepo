package Day11Assignment;

public class ThisKeyword2 {
        int variable=5;
	   int age=10;
	public static void main(String[] args) {
		ThisKeyword2 obj=new ThisKeyword2();
       obj.method(20);
	   obj.method();
	System.out.println("obj GV variable: "+obj.variable);
	ThisKeyword2 obj2=new ThisKeyword2();
	System.out.println("obj2 GV variable: "+obj2.variable);
	}
	
	void method(int variable) {
	System.out.println("value of variable: "+variable);
    System.out.println("GV value of variable: "+this. variable);
	this.variable=variable;
	System.out.println("value of variable: "+variable);
	System.out.println("GV value of variable: "+this. variable);
	}
	
	void method() {
	int variable=40;
    System.out.println("value of variable: "+variable);

	}

}
