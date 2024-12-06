package gr.codehub.generics4.lecture;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class WarningDemo2 {
    public static void main(String[] args) {
        Box<Integer> bi;
        bi = createBox();
        Box rawBox2 = bi;
        rawBox2.set(8);
        rawBox2.set("abc");
        //bi.set("abc"); // compiler error
    }

    static Box createBox() {
        return new Box();
    }

    private static Set<File> possibleWarning() {
        final Set cars = new HashSet();
        cars.add(new File("myFile"));
        return cars;
    }
}

