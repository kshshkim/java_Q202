package differentPackage_0502;

public class Cat {
    public static void main(String[] args) {
        Person slave = new Person();
        slave.height = 59;  // 상속된 클래스가 아니지만 같은 패키지 안에 있어서 접근 가능
        System.out.println(slave.height);
    }
}
