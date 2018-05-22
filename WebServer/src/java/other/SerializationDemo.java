
package other;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    
	/**
	 * This method is used to read data from file for deSerialization.
	 * @param file
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Object deSerialization(String file) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(file);
                Object object;
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                object = objectInputStream.readObject();
            }
		return object;
	}

	/**
	 * This method is used to write data to file for Serialization.
	 * @param file
	 * @param object
	 * @throws IOException
	 */
	public static void serialization(String file, Object object) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(file);
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(object);
                objectOutputStream.close();
            }
	}
}
