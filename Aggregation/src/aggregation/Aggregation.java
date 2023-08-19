package aggregation;

public class Aggregation {
    public static void main(String[] args) {
        /* ต้องสร้าง Object สองตัว*/
        MyAggregatedClass obj = new MyAggregatedClass();
        MyClass obj1 = new MyClass(obj);
        /* ถ้า MyClass ทำงานจบ MyAggregatedClass ยังทำงานต่อได้ */
        obj1.func();
    }
}
