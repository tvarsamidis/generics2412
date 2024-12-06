package gr.codehub.generics4.lecture;

public class WarningDemo {
//    Note: WarningDemo.java uses unchecked or unsafe operations
//    Note: If on command line, recompile with -Xlint:unchecked for details
//    use -Xlint:-unchecked or SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Box<Integer> bi;
        bi = createBox();
    }

    static Box createBox(){
        return new Box();
    }
}
