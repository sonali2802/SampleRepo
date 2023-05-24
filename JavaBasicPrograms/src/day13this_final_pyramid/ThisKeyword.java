package day13this_final_pyramid;


        class A2{
	   A2(){
	    this(5);
	     System.out.println("hello");
	   }
	A2(int x){
	   System.out.println(x);
	}
        }
         class ThisKeyword {
 
	public static void main(String[] args) {
        A2 a=new A2(10);
	}

}
