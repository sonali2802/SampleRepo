package properties;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

public class TestProperty5 {
	public static void main(String[] args) throws IOException {
		
		try
		{
		// TODO Auto-generated method stub
      System.out.println("Prperties Example");
      String propertyFileLocation="G:\\Sonali\\Automation Sesstion\\Workplace\\JavaBasicPrograms\\MyPoperties\\MyPop.properties";
      System.out.println("File Path"+propertyFileLocation);
      FileInputStream fis = new FileInputStream( "./MyPoperties/MyPop.properties");
		Properties prop=new Properties();	
		
		prop.load(fis);

		
		String pAmount=prop.getProperty("principleAmount");
		System.out.println(pAmount);
		//int k=pAmount*10;// because we can't perform arithmetic operations on String
		//converting string value to integer
		int amount=Integer.parseInt(pAmount);
		int res=amount/10;
		System.out.println("Result: "+res);
		int roi=Integer.parseInt(prop.getProperty("roi"));
		System.out.println("ROI: "+roi);		
        
		}
		
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
		
		
		
	}
}

