package array;

public class ArrayExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []number= {3,9,5,6,4};
		System.out.println("Original Value");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		System.out.println("Reverse Value");
		for(int i=number.length-1;i>=0;i--) {
			System.out.println(number[i]);
		}
			
	}

}
