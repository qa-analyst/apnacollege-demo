package ChromeAutomation;

public class Callingmethod {
	public int age;  //non static
	public static String Name;  //static

	public static void main(String[] args) {
		Callingmethod a=new Callingmethod();
		a.age=20;
		System.out.println(a.Name);
			Callingmethod b=new Callingmethod();
			a.m1();
		}
	public void m1() {
		System.out.println(age);
	}
}


