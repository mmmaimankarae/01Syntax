package observer;
import java.util.ArrayList;

public class HeadQuater implements Source {
    /* List เก็บObsever ที่ลงทะเบียนเข้ามา */
    private final ArrayList<MyObserver> list;
    private int someData; /* ข้อมูลที่อาจเปลี่ยนแปลง */

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    /* method set ค่าที่โดนเปลี่ยนแปลง */
    public void setSomeData(int aData) {
	    someData = aData;
	    notifyObservers();
    }
    public int getSomeData() {
	    return someData;
    }
    @Override /* method ลงทะเบียน */
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override /* method แจ้งให้คนลงทะเบียน */
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	    }
    }
}
