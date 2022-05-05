// 2016110652 김성현

package java_Q202;

import differentPackage_0502.Student;
import differentPackage_0502.Person;
import differentPackage_0502.Cat;

public class InheritanceEx_0502_2 {
    public static void main(String[] args) {
        Person person = new Person();  // 다른 패키지
        Student student = new Student();  // 다른 패키지
        Cat cat = new Cat();  // 다른 패키지
        CollegeStudent collegeStudent = new CollegeStudent();  // 같은 패키지

        student.set();
        System.out.println(student.name);
        System.out.println(student.getWeight());

//        System.out.println(collegeStudent.height);  // InheritanceEX가 상속을 받은 클래스가 아니기 때문에 에러

        collegeStudent.set();
        System.out.println(collegeStudent.name);
        System.out.println(collegeStudent.getWeight());
    }
}

