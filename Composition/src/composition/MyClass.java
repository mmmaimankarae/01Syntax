package composition;

public class MyClass {
    /* Attribute แบบ Object
     * ซึ่ง Reference ไปถึง MyAggregatedClass */
    private MyCompositionClass cp;
    public MyClass() {
        /* สร้างObject ของMyCompositionClass
         * อยู่ข้างในConstructor */
        cp = new MyCompositionClass();
    }
    public void func() {
        cp.func1();
    }
}
