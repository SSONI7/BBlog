package Bblog.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Bblog.testcase.TC01;

public class PropertiesFiles {

	  
	static Properties prop = new Properties();
	
	public static Properties readPropertiesFiles() {
		   
		try
		{
			InputStream input  = new FileInputStream("C:\\Users\\Saniket\\git\\Bblog\\saniketBblog\\Testdata\\TC01.properties");
			prop.load(input);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	} 
	
	public static  Properties writePropertiesFiles() {
		
		try {
			
			OutputStream output = new FileOutputStream("C:\\Users\\Saniket\\git\\Bblog\\saniketBblog\\Testdata\\TC01.properties");
			//prop.setProperty(key, value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	}
	
	public static void main(String[] args) {
		
		readPropertiesFiles();
	
 
		
		
	}

}
