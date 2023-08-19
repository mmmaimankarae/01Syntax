package semanticfbc;
/* Superclass */
public class SemanticFBCSuperclass {
	private int number;
	public SemanticFBCSuperclass(int val) {
		setNumber(val);
	}
	public void f1() {
		System.out.println("In f1() of SemanticFBCSuperClass");
		//number++;
		setNumber(number+1);
	}
	public void setNumber(int val) {
		number = val;
	}
}
