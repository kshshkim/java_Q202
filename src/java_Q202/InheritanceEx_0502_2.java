package java_Q202;

import differentPackage_0502.Student;
import differentPackage_0502.Person;
import differentPackage_0502.Cat;

public class InheritanceEx_0502_2 {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        Cat c = new Cat();
        CollegeStudent cs = new CollegeStudent();
        s.set();
        System.out.println(s.name);
        System.out.println(s.getWeight());

        cs.set();
        System.out.println(cs.name);
        System.out.println(cs.getWeight());
//        System.out.println(cs.height); // protected는 상속된 클래스에서만 접근 가능
//        System.out.println(p.height);

    }
}

