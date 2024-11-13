package com.Epsondoms.PropertyFileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static FileInputStream fis = null;
	public static FileOutputStream fos = null;
	public static Properties property = null;

	public static String readData(String key) {
		// Convert the physical file into java readable file
		try {
			fis = new FileInputStream("./src/test/resources/TestData/commondata.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// create object for proparties class
		property = new Properties();

		// Load all the key/datas
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// fetch the data
		String data = property.getProperty(key);
		return data;

	}

	public static void writeData(String key, String value) {

		// create the file
		try {
			fis = new FileInputStream("./src/test/resources/TestData/commondata.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2. Create Object
		property = new Properties();

		// 3 Load all the keys
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 4.Write the date

		property.put(key, value);

		// 5. convert java readable into physical file
		try {
			fos = new FileOutputStream("./src/test/resources/TestData/commondata.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
