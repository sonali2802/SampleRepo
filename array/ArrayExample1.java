package array;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []number= {3,9,5,6,4};
		
		int []number1=number;
		System.out.println("Copy 1 Array to Another Array"); 
		
		
		System.out.println("First original Array values"); 
		for(int n:number){
			System.out.println(n); 
		}
		System.out.println("Second Copy Array values"); 
		for(int n:number1){
			System.out.println(n); 
		}
	}

}
  