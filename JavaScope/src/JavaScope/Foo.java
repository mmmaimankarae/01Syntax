package JavaScope;

public class Foo {
    /* access private จากนอก Class ไม่ได้ */
    private int a;
    public int b;
    /* Normally: access ให้ subclass
     * But JavaScope ให้ ถ้าอยู่ packege เดียวกับ Class */
    protected int c;
    /* Package Scope */
    int d;
}
