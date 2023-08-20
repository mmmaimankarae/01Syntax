package singleton;
/* Main */
public class Singleton {
    public static void main(String[] args) {
        Experiment myEx = Experiment.getEx();
	    myEx.setResult("Good");
	    System.out.println(myEx.getResult());
	    Experiment myEx1 = Experiment.getEx();
	    System.out.println(myEx1.getResult());
    }
}
