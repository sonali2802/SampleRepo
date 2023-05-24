package properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class TestProperty1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      System.out.println("Prperties Example");
      String fileLocation="G:\\Sonali\\Automation Sesstion\\Workplace\\JavaBasicPrograms\\MyPoperties\\MyPop.properties";
      System.out.println("File Path"+fileLocation);
      FileInputStream fis = new FileInputStream(fileLocation);
  	
		Properties prop=new Properties();	
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("mobile"));
		System.out.println(prop.getProperty("city"));
	
	}

}