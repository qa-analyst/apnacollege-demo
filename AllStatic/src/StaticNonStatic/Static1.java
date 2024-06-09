package StaticNonStatic;

public class Static1 {

	static int x = 1;  //single copy 
	int y = 5;


	public static void main(String[] args) {
		Static1 obj1 = new Static1();
		obj1.y = 17;
		obj1.x=12;
		System.out.println(x);       //12
		System.out.println(obj1.x);  //12
		System.out.println(obj1.y);   // 17
		System.out.println(obj1.y);    //17
		Static1 obj2 = new Static1();
		
		obj2.y = 27;
		System.out.println(obj1.y);  //17
		System.out.println(obj1.x); //12
		System.out.println(obj2.x);  //12
		System.out.println(x);  //12
		System.out.println(obj2.y);  //27
		    obj1.x=11;
		System.out.println(obj2.x);  //11
		obj2.x=60;
		System.out.println(obj1.x); //60
		System.out.println(obj1.y);  //17
		System.out.println(obj2.y);  //27
		Static1 obj3=new Static1();  
		System.out.println(obj3.x);  //60 
		System.out.println(obj3.y);  // 5
		System.out.println(obj1.x);  //60

	}
}
