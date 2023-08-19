package aggregation;

public class MyClass {
    /* Attribute แบบ Object
     * ซึ่ง Reference ไปถึง MyAggregatedClass */
    private MyAggregatedClass ac;
    /* Set ค่า โดยให้ส่งParameter ของConstructor
     * มาเป็นObject MyAggregatedClass */
    public MyClass(MyAggregatedClass ac) {
        this.ac = ac;
    }

    public void func() {
        ac.func1();
    }
}
