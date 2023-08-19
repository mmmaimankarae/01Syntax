package abstractclass;
/* Inheritance Abstract Class */
public class FooConcrete2 extends FooAbstract{
    @Override
    public int operate() {
        return this.getValue1() * this.getValue2();
    }
}
