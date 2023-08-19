package providedrequiredinterface;
import componentA.ComponentA;
import componentA.ComponentAProvidedInterface;
import componentB.ComponentB;
import componentB.ComponentB1;
import componentB.ComponentBProvidedInterface;

public class ProvidedRequiredInterface {

    public static void main(String[] args) {
        ComponentAProvidedInterface objA = new ComponentA();
        ComponentBProvidedInterface objB = new ComponentB();
        ComponentBProvidedInterface objB1 = new ComponentB1();
        objA.componentAMethod1(objB);
        objA.componentAMethod2(objB1);
    }
}