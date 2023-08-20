package observer;

public class Marketing implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println(
                "(marketing) headquater is updated to "
                + ((HeadQuater)o).getSomeData());
    }
}
