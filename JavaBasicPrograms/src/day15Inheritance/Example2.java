package day15Inheritance;
class Country1{
  Country1(int i){
      System.out.println("I am int-param cons of Country class");
  }

	void display() {
		System.out.println("I am display method of country");
	}
}	
   class State1 extends Country1{
          State1() {    
	      super(25);
	   System.out.println("I am zero param cons of State class");
          }
         void calling() {
      System.out.println("I am calling method of State");
         }
   }
   class City extends State1{
   
	   void printing() {
	  System.out.println("I am print method"); 
   
		
	}
	   
   }
   public class Example2 {

	public static void main(String[] args) {
		  City s1=new City();
	       s1.display();
	       s1.calling();
	       s1.printing();
	}
	}
   


