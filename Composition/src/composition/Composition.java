package composition;

public class Composition {
    public static void main(String[] args) {
        /* สร้าง Object แค่ 1 ตัว
         * เมื่อMyClass ทำงานเสร็จแล้ว
         * Object ที่ถูกสร้างด้านในConstructor จะจบด้วย */
       MyClass obj = new MyClass();
       obj.func();
    }
}
