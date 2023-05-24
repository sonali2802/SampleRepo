package predefinedclasses.stringclasses;

public class StringBuilderClass {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java"); 
		System.out.println(sb); 
		sb.reverse();
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("Hello Java");
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder("Hello Java");
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		//first convert StringBuffer/StringBuilder to String class using toString()
		// dn use equals() of string class
		System.out.println((sb1.toString().equals(sb2.toString())));
	}
}
