package objectCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class _4_ObjectSerialization implements Serializable{

	/*
	 * Whenever we serialize and then deserialize an object, JVM creates a separate
	 * object. 
	 * 
	 * In deserialization, JVM doesn’t use any constructor to create the
	 * object. 
	 * 
	 * To deserialize an object we need to implement the Serializable
	 * interface in the class.
	 */

	String dummy="";
	
	public static void main(String[] args) throws IOException {

		_4_ObjectSerialization objSerialized = new _4_ObjectSerialization();
		objSerialized.dummy = "Step 1 : Learning Object Creation using deserialization";
		
		FileOutputStream fos = new FileOutputStream("ObjCreationUsingDeserialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(objSerialized);
		oos.close();
		fos.close();
		
	}

}


//Creation of Object using Deserialization
class _4_UsingObjectDeserialization{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		_4_ObjectSerialization obj;
		
		FileInputStream fis = new FileInputStream("ObjCreationUsingDeserialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		obj = (_4_ObjectSerialization) ois.readObject();
		
		System.out.println(obj.dummy);
		
	}
}
