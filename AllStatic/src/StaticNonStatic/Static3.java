package StaticNonStatic;

public class Static3 {
	static String A="Hello";   //single copy
	String B="Ranjeet";        //multiple copy
    
	public static void main(String[] args) {
		Static3 obj1=new Static3();
		
		System.out.println(obj1.A);   //Hello
		System.out.println(obj1.B);   //Ranjeet
		obj1.A="Hi";                      
		Static3 obj2=new Static3();
		obj2.B="Look";
		System.out.println(obj2.A);    //Hi
		System.out.println(obj1.A);    //Hi
		System.out.println(obj2.B);    //Look
	

	}

}
