package factory;

/* Class of Client */
public class Factory {
    public static void main(String[] args) {
        // Automobile myAuto = new Ford/* Toyota */();
        /* = new Automobile(); ไม่ได้ เพราะ abstract class ไม่ให้สร้าง Object */
        /* = new AutomobileFactory(); ไม่ได้ เพราะ โดนเรียกใช้โดย static main */

        /* Automobile myAuto =
                AutomobileFactory.createAutomobile("Ford"); */
        /* createAutomobile ถูกประกาศเป็น static
         * >> เรียกใช้งานได้ โดยไม่ต้องสร้างObject */
	    System.out.println(AutomobileFactory.createAutomobile("Ford"));
    }
}
