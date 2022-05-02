package java_Q202;

public class StringEx_0502 {
    public static void main(String[] args) {
        String a = "      abcd def      ";
        String b = "      xyz\t";
        String c = a.trim(); // c = "abcd def". 문자열 중간에 있는 공백은 제거되지 않음
        String d = b.trim(); // d = "xyz". 스페이스와 '\t' 제거됨"

        System.out.println(c);
        System.out.println(d);


    }
}
