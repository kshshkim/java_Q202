package java_Q202;

public class Circle_0411_4 {
    int radius;
    public Circle_0411_4(int radius) {
        this.radius = radius;
    }
    public void set(int radius) {
        this.radius = radius;
    }
    public static void main(String [] args) {
        Circle_0411_4 ob1 = new Circle_0411_4(1);
        Circle_0411_4 ob2 = new Circle_0411_4(2);
        Circle_0411_4 s;

        s = ob2;
        ob1 = ob2;
        System.out.println("ob1.radius=" + ob1.radius);
        System.out.println("ob2.radius=" + ob2.radius);

    }
}
