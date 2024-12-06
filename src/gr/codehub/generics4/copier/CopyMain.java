package gr.codehub.generics4.copier;

import java.io.IOException;

public class CopyMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("Thomas", 22);
        System.out.println(person1.toString());

        Copy1ByFile copier = new Copy1ByFile();
        copier.copyObject(person1);
    }
}
