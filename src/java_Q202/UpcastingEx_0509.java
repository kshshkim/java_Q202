package java_Q202;

import java.util.Arrays;

class Person {
    String name;
    String id;
    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;
    public Student(String name) {
        super(name);
    }
}

public class UpcastingEx_0509 {
    public void say_hi(Student st, Person pe) {
        System.out.println(st.name + pe.name);
    }

    public static void main(String[] args) {
        Person p = new Person("김재문");
        Student s = new Student("이재문");
        UpcastingEx_0509 u = new UpcastingEx_0509();
//        p = s;
        System.out.println(s.name);
        u.say_hi(s, s);

        Person[] plist = {p, s};
        System.out.println(Arrays.toString(plist));
    }
}
