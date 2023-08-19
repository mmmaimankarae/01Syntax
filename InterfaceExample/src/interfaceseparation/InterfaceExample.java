package interfaceseparation;

public class InterfaceExample {

    public static void main(String[] args) {
        /* Obj reference to Interface 1
           ถูกจำกัดการมองเห็น */
        Interface1 obj = new MyClass();
        System.out.println("Val = " + Interface1.val);
    }
}
