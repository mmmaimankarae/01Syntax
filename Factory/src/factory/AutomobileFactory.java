package factory;
/* Class กลาง */
public class AutomobileFactory {
	/* method ที่เรียก constructor ของอีกclass
	 * แค่ static เพราะเป็นการเรียก method เฉยๆ
	 * ไม่จำเป็นต้องสร้างObject */
	public static Automobile createAutomobile(String type) {
		if (type.equals("Toyota")) 
			return new Toyota();
		else if (type.equals("Ford"))
			return new Ford();
		return null;
	}
}
