package com.seraliation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.seralization.Employee;

public class SeralizationUtil {
	/*public static Object WrieintoFile(String file,Object obj) throws IOException{
		
		FileOutputStream fos=new FileOutputStream(new File(file));
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		return oos;
	}*/
	public static Object inputFile(String file) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream(new File(file));
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee)ois.readObject();
		return emp;
		
	}

}
