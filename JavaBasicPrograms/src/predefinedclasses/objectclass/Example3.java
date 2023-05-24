package predefinedclasses.objectclass;

public class Example3 extends Demo{	 


static int last_roll=100;
int roll_no;
Example3()
{ 
roll_no=last_roll;
last_roll++;
}

	public static void main(String[] args) {
 Example3 s=new Example3();
	System.out.println(s);
	System.out.println(s.toString());
	System.out.println(s.hashCode());
	Demo d1=new Demo();
	System.out.println(d1);
	System.out.println(d1.toString());
	System.out.println(s.hashCode());

	
	
	
	
	
	}

}
