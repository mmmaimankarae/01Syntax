package autowofactory;
/* Class of Client */
public class AutoWOFactory {
    public static void main(String[] args) {
        Automobile myAuto = getCarTypeFromUser("Ford");
	    System.out.println(myAuto);
    }
    /* method ที่ยังต้องอ้างถึง concrete class (Process) */
    public static Automobile getCarTypeFromUser(String type) {
        Automobile auto = null;
        if (type.equals("Toyota")) 
            auto = new Toyota();
	    else if (type.equals("Ford"))
            auto = new Ford();
	    return auto;
        /* ถ้าเพิ่มยี่ห้อรถ จะต้องมาแก้โปรแกรมฝั่งClient ด้วย */
    } 
}
