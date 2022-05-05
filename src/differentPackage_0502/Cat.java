package differentPackage_0502;

public class Cat {
    Person slave = new Person();
    public static void main(String[] args) {
        Cat c = new Cat();
        c.slave.height = 111;
        c.slave.name = "mr slave";
        System.out.println(c.slave.height);
    }
}
