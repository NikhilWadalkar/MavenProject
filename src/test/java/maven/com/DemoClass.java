package maven.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DemoClass implements Property{
	FileReader reader=new FileReader("config.properties");
	Properties pro = new Properties();
	
	public DemoClass() throws IOException {
		pro.load(reader);
	}
	@Test
	public void demoMethod()
	{
		System.out.println("This is very first Maven Project");
	}
	
	@Test
	public void propertyFie()
	{
		System.out.println("Data from interface property file" +name );
		System.out.println("Data from property file" +pro.getProperty("name") );
	}
	
	
	@Test
	public void laiBorezale()
	{
		System.out.println("laiBorezale" );
		
	}
}
