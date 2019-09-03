package collections.list.arrayList;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class _6_DeSerializationClass {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream("myfile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			arraylist = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
		for (String tmp : arraylist) {
			System.out.println(tmp);
		}
	}
}