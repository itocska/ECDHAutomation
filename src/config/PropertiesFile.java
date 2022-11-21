package config;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties prop = new Properties();
	
	public static void main(String [] args)
     {
		readPropertiesFile();
		//writePropertiesFile();

     }
	
	public static void readPropertiesFile() 
	{
		try {
			String path = System.getProperty("user.dir");
			InputStream input = new FileInputStream(path + "/src/config/configexample.properties");
		    prop.load(input);
		    //System.out.println(prop.getProperty("browser"));
		    //System.out.println(prop.getProperty("OS"));
		    //System.out.println(prop.getProperty("usr"));
		    //System.out.println(prop.getProperty("pass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*public static void writePropertiesFile()
      { 	
		try {
			OutputStream output = new FileOutputStream("/Users/PH/Desktop/ecdh-master/config/configexample.properties");
			
			prop.setProperty("result","pass");
			prop.store(output, null);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }*/
}
