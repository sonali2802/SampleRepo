package day2.basicexample;

public class Example1 {
	
public static void display()
{
	System.out.println("Display Method");
}

 static void showdetails(int a)
{
	System.out.println("showdetails Method" +a);
}

 static void addno()
{
	System.out.println("addno Method");
}



	public static void main(String[] args) {
        
		display();
		showdetails(1);
		showdetails(2);
		showdetails(3);
		addno();
		
	}

}
