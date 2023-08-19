package abstractclass;
/* Inheritance Abstract Class */
public class FooConcrete1 extends FooAbstract {
    @Override
    public int operate() {
        return this.getValue1() + this.getValue2();
    }
}
