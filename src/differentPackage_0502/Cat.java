// 2016110652 김성현

package differentPackage_0502;

public class Cat {  // 상속받지 않은 독립적인 클래스
    public Person slave = new Person();
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.slave.age = 22;
        cat.slave.height = 170;  // protected, 상속받진 않았으나, 같은 패키지에 있어서 접근 가능
        cat.slave.name = "mr slave";  //public
        System.out.println(cat.slave.height);
        System.out.println(cat.slave.name);
        System.out.println(cat.slave.age);
//        System.out.println(cat.slave.weight);  // private 에러 발생
    }
}
