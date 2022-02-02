package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile{

	private Properties properties;
	private final String propertyFilepath = "C:\\Users\\venki\\eclipse-workspace\\SwagLabsMavenProj\\config\\config.properties";

	public ReadPropertyFile() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilepath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();

			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException("cinfiguration.properties not found at:" + propertyFilepath);

		}
	}

	public String getBrowerName() {
		return properties.getProperty("Browser");
	}

	public String getUserName() {
		return properties.getProperty("UserName");
	}

	public String getPassWord() {
		return properties.getProperty("passWord");
	}

	public String getApplicationUrl() {
		return properties.getProperty("url");
	}
	
	public String firstName() {
		return properties.getProperty("firstName");
	}

}
