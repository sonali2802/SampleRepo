package Day7Assignment3;

public class P6Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int count =0,num =12345678;
	//for(;num!=0;num/=10; ++count)
    for (; num != 0; num /= 10, ++count) {
    }

		
		System.out.println("Number of digits"+count);

}
}