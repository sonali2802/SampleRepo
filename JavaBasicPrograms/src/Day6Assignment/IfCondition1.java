package Day6Assignment;

public class IfCondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int year = 2000;
	 if(((year % 4 == 0)&&(year % 100!=0)) || (year %400 == 0))  {
	
	System.out.println("Leap Year");
	 }else {  
	
	System.out.println("Common Year or Non Leap Year");
	          
	 }
	
	
	}

}
