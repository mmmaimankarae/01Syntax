package componentA;
import componentB.ComponentBProvidedInterface;

public interface ComponentAProvidedInterface {
    /* method 1 & 2 = Provided Interface of A,
    *  parameter = Required Interface from B */
    public void componentAMethod1(ComponentBProvidedInterface comp);
    public void componentAMethod2(ComponentBProvidedInterface comp);
}