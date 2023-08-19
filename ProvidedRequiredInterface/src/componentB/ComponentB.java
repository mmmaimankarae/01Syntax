package componentB;

public class ComponentB implements ComponentBProvidedInterface {
    /* Implement component B */
    @Override
    public void componentBMethod1() {
        System.out.println("Component B method 1");
    }

    @Override
    public void componentBMethod2() {
        System.out.println("Component B method 2");
    }
}