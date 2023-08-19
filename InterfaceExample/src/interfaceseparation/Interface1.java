package interfaceseparation;

public interface Interface1 {
    /* In java: Interface must have only "abstract method".
    *  Abstract method doesn't have body. */
    /* Can define constant (final = ค่าคงที่) */
    /* Default: final static */ int val = 5;
    /* Static = เรียกใช้ได้ผ่านทางชื่อInterface */
    public void func1(int a);
    public void func2(double b);
}
