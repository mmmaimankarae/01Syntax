package observer;

public class Senior implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println(
                "(senior) headquater is updated to " +
                ((HeadQuater)o).getSomeData());
    }
}
