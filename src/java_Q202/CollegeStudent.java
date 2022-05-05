// 2016110652 김성현

package java_Q202;

import differentPackage_0502.Student;
import differentPackage_0502.Person;

public class CollegeStudent extends Student {
    public void set() {
//        weight = 5;  // private 에러 발생
//        age = 3;  // default  다른 클래스이기 때문에 에러 발생
        height = 149; // protected 상속된 클래스에서 접근 가능
        name = "대학생"; // public
        setWeight(55);
        System.out.println(height);
    }
}
