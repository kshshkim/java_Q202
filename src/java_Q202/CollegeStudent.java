package java_Q202;

import differentPackage_0502.Student;
import differentPackage_0502.Person;

public class CollegeStudent extends Student {
    public void set() {
//        weight = 5;  // private
//        age = 3;  // default
        height = 1; // protected 상속된 클래스에서 접근 가능
        name = "대학생"; // public
        setWeight(5);
    }
}
