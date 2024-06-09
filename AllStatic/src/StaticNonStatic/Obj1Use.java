package StaticNonStatic;

import ChromeAutomation.ChromeAuto;

public class Obj1Use {
	public static void main(String[] args)  throws InterruptedException{
			 ChromeAuto.launchBrowser();
			 ChromeAuto.openUrl("https://facebook.com");
			 ChromeAuto.closeBrowser();
			 ChromeAuto.printTitle();
			 
			 ChromeAuto.launchBrowser();    ///Design
			 ChromeAuto.openUrl("https://facebook.com");
			 ChromeAuto.closeBrowser();
			 ChromeAuto.printTitle();
			  //class-Design
			 //object-implementation
			 new NonStaticObj1();    
		} 
	
					
	}
	


