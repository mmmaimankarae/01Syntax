package interfaceseparation;

public class MyClass implements Interface1, Interface2, Interface3 {
    /* Implements all abstract methods */
    public void printVal() { /* Method of MyClass (not implement) */
        System.out.println("printVal val = " + val);
    }
    @Override
    public void func1(int a) {
        System.out.println("func1 a = " + a);
        
    }

    @Override
    public void func2(double b) {
        System.out.println("func2 b = " + b);
    }

    @Override
    public void func3(int a) {
        System.out.println("func3 a = " + a);
    }

    @Override
    public void func4(double b) {
        System.out.println("func4 b = " + b);
    }

    @Override
    public void func5(int a) {
        System.out.println("func1 a = " + a);
    }

    @Override
    public void func6(double b) {
        System.out.println("func2 b = " + b);
    }
    
}
