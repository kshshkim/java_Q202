package another_package;
import a_package.*;

public class Test extends Student {
    public void set() {
        height = 170;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.set();
        s.setWeight(199);
        System.out.println(s.getWeight());

        Person p = new Person();
        p.setWeight(30);
        System.out.println(p.getWeight());

        Test asdf = new Test();
        asdf.set();
        System.out.println(asdf.height);
    }
}
