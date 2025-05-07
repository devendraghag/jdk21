package ObjectCreation;

import java.io.*;

class DeserializeExample implements Serializable {
    String message = "Object created using Deserialization";

    void display() {
        System.out.println(message);
    }
}

class DeserializeTest {
    public static void main(String[] args) throws Exception {
        // Serialize object
        DeserializeExample obj1 = new DeserializeExample();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"));
        out.writeObject(obj1);
        out.close();

        // Deserialize object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"));
        DeserializeExample obj2 = (DeserializeExample) in.readObject();
        in.close();

        obj2.display();
    }
}
