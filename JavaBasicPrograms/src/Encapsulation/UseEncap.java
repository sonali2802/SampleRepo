package Encapsulation;

 class UseEncap1 {
	// private data member
		private int pinCode = 411015;
		//getter method allow you to use your private data from outside the class
		public int getPinCode() {
			return pinCode;
		}
}
class UseEncap{
	public static void main(String[] args) {
		UseEncap1 s=new UseEncap1();
		// creating instance of the encapsulated class
				
				//System.out.println(s.pinCode());//error, as private member are not accessible from out side the class
				// getting value of the name member
				System.out.println(s.getPinCode());
				//you can't modify private variable as we dont have setter method here
				//s.pinCode=411015;
	}
}