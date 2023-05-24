package pack;

public class AccessDefaultMembers {


		public static void main(String[] args) {
			
			DefaultMembers p1=new DefaultMembers();
			System.out.println("Accessing default members from another class within same package");
			System.out.println(p1.accNum);
			p1.displayAccNum();
		}

	}
//we cannot access default members from outside the package