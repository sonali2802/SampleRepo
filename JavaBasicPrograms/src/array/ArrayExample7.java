package array;

public class ArrayExample7 {

	public static void main(String[] args) {
		int []number= {3,9,5,6,4,7,8,4,3,8};
		System.out.println("Original Value");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
		System.out.println("Even position element");
		for(int i=1;i<number.length;i=i+2) {
			System.out.println(number[i]);
		}
		
	}

}
