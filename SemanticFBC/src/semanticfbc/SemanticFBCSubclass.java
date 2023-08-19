package semanticfbc;
/* Subclass */
public class SemanticFBCSubclass extends SemanticFBCSuperclass {
    public SemanticFBCSubclass(int val) {
        super(val);
    }
    @Override
	public void setNumber(int val) {
		System.out.println("setNumber() overridden version");
		super.setNumber(val);
	}
}
