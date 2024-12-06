package gr.codehub.generics4.copier;

import java.io.IOException;

public class CopyMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("Thomas", 22);
        System.out.println(person1.toString());

        Copy1ByFile copier = new Copy1ByFile();
        Person person2 = (Person)copier.copyObject(person1);
        System.out.println(person2);
        person2.setName("Panos");
        System.out.println(person2);

        Copy2ByFile<Person> copier2 = new Copy2ByFile<>();
        Person person3 = copier2.copyObject(person1);
        System.out.println(person3);

        Copy3ByFile copier3 = new Copy3ByFile();
        Person person4 = copier3.copyObject(person1);
        System.out.println(person4);

        Person person5 = CopySerializable.copyObject(person1);
        System.out.println("Person5=" + person5);
    }

}
