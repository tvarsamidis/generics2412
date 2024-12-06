package gr.codehub.generics4.copier;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Copy3ByFile {
    public <T> void saveObject(String filename, T o) throws IOException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(o);
            out.close();
        } catch (Exception e) {
        }
    }

    public <T> T readObject(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
        T o = (T) in.readObject();
        return o;
    }

    public <T> T copyObject(T o) throws IOException, ClassNotFoundException {
        String secretFilename = "data\\secret.data";
        saveObject(secretFilename, o);
        T o2 = readObject(secretFilename);
        return o2;
    }
}
