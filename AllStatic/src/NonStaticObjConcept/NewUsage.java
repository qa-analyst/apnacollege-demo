package NonStaticObjConcept;

public class NewUsage {

	public static void main(String[] args) {
		A aObj=new A();
		System.out.println(aObj.nsv1);
	    aObj.nsa1();
	    System.out.println(aObj.nsv1);
	    aObj.nsa2();
	    System.out.println();
	}

}
