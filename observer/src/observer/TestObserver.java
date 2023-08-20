package observer;

public class TestObserver {
    public static void main(String[] args) {
		Senior obj1 = new Senior();
		Marketing obj2 = new Marketing();
		HeadQuater obj = new HeadQuater();
		obj.register(obj1); /* ลงทะเบียน */
		obj.register(obj2);
		obj.setSomeData(6); /* เปลี่ยนค่า */
        obj.setSomeData(7);
    }
}
