package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class TestProperty6 {

	public static void main(String[] args) throws ArithmeticException, IOException {
		
		/*
		 * 1. First find the location where you have stored property file
		   2. Create an instance of FileInputStream class and pass the property file location to its constructor.
		   3. Create an instance of Properties class
		   4. With the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
   		   5. Call get(key) of Properties class to read data from property file
		 */
		/*Property file location with 
		 * absolute path: F:\JavaWorkspace\CoreJavaSessions\PropertyFiles\TestData.properties
		 * relative path: .\PropertyFiles\TestData.properties
		 * Using System class:
		 * 			String currentDir=System.getProperty("user.dir");
		 * 			String propertyFileLocation =currentDir+"\\PropertyFiles\\TestData.properties";
		 */
		FileInputStream fis = new FileInputStream("G:\\Sonali\\Automation Sesstion\\Workplace\\JavaBasicPrograms\\MyPoperties\\MyPop.properties");
	
		Properties prop=new Properties();		

		
		prop.load(fis);
		
		String pAmount=prop.getProperty("principleAmount");
		System.out.println(pAmount);
		int amount=Integer.parseInt(pAmount);
		int res=amount/10;
		int roi=Integer.parseInt(prop.getProperty("roi"));
		System.out.println("Result: "+res);
		System.out.println("ROI: "+roi);
		//to wrote content into the file use setProperty()
		prop.setProperty("Test3", "Java1111111");
		prop.setProperty("Test4", "Testng111111");
		prop.setProperty("ABC", "ABC11111111111");
		//location where you want to save your file using FileOutputStream
		FileOutputStream fos= new FileOutputStream("./MyPoperties/MyPop.properties");
		//saving the file into required location using store()
		prop.store(fos, "Added two new pair of keys");
		//close the connection
		fos.close();	
		System.out.println("Property file updated successfully....");
	}
}
