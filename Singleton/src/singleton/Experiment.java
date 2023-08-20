package singleton;
/* Class ผลการทดลองที่ต้แงการให้ทุกคนใช้ร่วมกัน */
public class Experiment {
	private String result;
	/* Attribute เป็นตัวเอง */
	private static Experiment ex = null;
	/* private constructor */
	private Experiment() {
		result = "";
	}
	public static Experiment getEx() {
		/* มีใครเคยสร้างไหม */
		if (ex == null) {
			ex = new Experiment();
		}
		return ex;
	}
	public void setResult(String r) {
		result = r;
	}
	public String getResult() {
		return result;
	}
}
