package day12.constructors;

class B{
       int i=10;
      B()   {
          System.out.println("Running class B constructor");
                  i=23;
      }
}

public class Constructor7 {
      public static void main(String[] args) {
       System.out.println("Main() of class cons5 is started");
	          B b1=new B();
            b1.i=55;
      System.out.println("class B global variable i= "+b1.i);
      System.out.println("Runing class B2 is constructor");
          B b2=new B();
      System.out.println("class B global variable i ="+b2.i);
      System.out.println("Main() of class cons5 is end here");
      }

}
