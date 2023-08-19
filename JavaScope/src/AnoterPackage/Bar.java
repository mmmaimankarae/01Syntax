package AnoterPackage;
import JavaScope.Foo;

public class Bar extends Foo{
    /* เก็บค่าa, b, c, d หมดเลย แต่ access ไม่ได้ 
     * ถ้าอยากเข้าถึงได้ก็ต้องสร้าง method ให้เลือก */
    public void f1() {
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
