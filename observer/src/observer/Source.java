package observer;
/* Interface & Abstract method */
public interface Source {
    /* แจ้งให้Observer ทราบ */
    public void notifyObservers();
    /* การลงทะเบียนของObserver */
    public void register(MyObserver observer);
}
