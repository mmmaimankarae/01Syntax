package abstractclass;

public class AbstractClass {
    public static void main(String[] args) {
        /* Object of FooConcrete1() */
        FooAbstract obj = new FooConcrete1();
        obj.setValue1(3);
        obj.setValue2(5);
        operate(obj); /* Operate of main */
    }
    /* คุณสมบัติ Polymorphism: เขียนObject ที่สืบถอดจากSuper class
    *   ได้หลากหลายรูปแบบ เช่น รับObject จาก parameter*/
    public static void operate(FooAbstract obj) {
        System.out.println(obj.operate());
    }
}
