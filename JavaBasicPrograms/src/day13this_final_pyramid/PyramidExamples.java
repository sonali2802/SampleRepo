 package day13this_final_pyramid;

public class PyramidExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<6;i++) {//number of lines in pyramid
			for(int j=1;j<=i;j++) {//pattern in pyramid
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("**************************");
		for(int i=1;i<6;i++) {//number of lines in pyramid
			for(int j=1;j<=i;j++) {//pattern in pyramid
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("**************************");
		for(int i=1;i<6;i++) {//number of lines in pyramid
			for(int j=1;j<=i;j++) {//pattern in pyramid
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("**************************");
		for(char i='a';i<'f';i++) {//number of lines in pyramid
			for(char j='a';j<=i;j++) {//pattern in pyramid
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("**************************");
		for(int i=5;i>0;i--) {//number of lines in pyramid
			for(int j=i;j>0;j--) {//pattern in pyramid
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
