package componentA;
import componentB.ComponentBProvidedInterface;

public class ComponentA implements ComponentAProvidedInterface {
    /* Implement component A */
    @Override
    public void componentAMethod1(ComponentBProvidedInterface comp) {
        System.out.println("Component A method 1");
        comp.componentBMethod1();
    }

    @Override
    public void componentAMethod2(ComponentBProvidedInterface comp) {
        System.out.println("Component A method 2");
        comp.componentBMethod2();
    }
}