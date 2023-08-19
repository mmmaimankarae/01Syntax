package componentB;

public class ComponentB1 implements ComponentBProvidedInterface {
    /* Implement component B */
    @Override
    public void componentBMethod1() {
        System.out.println("Component B1 method 1");
    }

    @Override
    public void componentBMethod2() {
         System.out.println("Component B1 method 2");
    }
}