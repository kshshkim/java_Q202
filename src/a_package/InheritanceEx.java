package a_package;

public class InheritanceEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
        s.setWeight(1200);
        System.out.println(s.getWeight());
        System.out.println(s.height);
        System.out.println(s.name);
    }
}
