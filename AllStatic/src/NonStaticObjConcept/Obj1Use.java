package NonStaticObjConcept;

import ChromeAutomation.ChromeAuto;

public class Obj1Use {
	public static void main(String[] args)  throws InterruptedException{
			
			 
			
			  //class-Design
			 //object-implementation
			NonStaticObj1 x=new NonStaticObj1(); 
			NonStaticObj1 y=new NonStaticObj1();
			NonStaticObj1 z= new NonStaticObj1();
			
			x.launchBrowser();
			y.launchBrowser();
			z.launchBrowser();
			x.time="00";
			x.openUrl("https://facebook.com");
			y.openUrl("https://flipkart.com");
			z.openUrl("https://gmail.com");
		} 
	
					
	}
	


