package differentPackage_0502;

public class Student extends Person {
    public void set() {
//        weight = 99; // private
        age = 30; // default
        height = 175; // protected
        name = "홍길동"; // public

        setWeight(99); // private 멤버 weight은 setWeight()으로 간접 접근
    }
}

