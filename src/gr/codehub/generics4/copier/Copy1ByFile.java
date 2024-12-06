package gr.codehub.generics4.copier;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Copy1ByFile {
    public void saveObject(String filename, Object o) throws IOException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(o);
            out.close();
        } catch (Exception e) {
        }
    }

    public Object readObject(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
        Object o = in.readObject();
        return o;
    }

    public Object copyObject(Object o) throws IOException, ClassNotFoundException {
        String secretFilename = "data\\secret.data";
        saveObject(secretFilename, o);
        Object o2 = readObject(secretFilename);
        return o2;
    }
}
