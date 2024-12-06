package gr.codehub.generics4.copier;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CopySerializable {
    public static <T> byte[] saveObject(T o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(o);
        out.close();
        return baos.toByteArray();
    }

    public static <T> T readObject(byte[] bytes) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes));
        T o = (T) in.readObject();
        return o;
    }

    public static <T> T copyObject(T o) throws IOException, ClassNotFoundException {
        byte[] bytes = saveObject(o);
        T o2 = readObject(bytes);
        return o2;
    }
}
