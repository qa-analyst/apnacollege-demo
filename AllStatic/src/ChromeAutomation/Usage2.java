package ChromeAutomation;


public class Usage2 {
	

	public static void main(String[] args)  throws InterruptedException{
 ChromeAuto.launchBrowser();
 ChromeAuto.openUrl("https://facebook.com");
 ChromeAuto.closeBrowser();
 ChromeAuto.printTitle();
 
 ChromeAuto.launchBrowser();
 ChromeAuto.openUrl("https://facebook.com");
 ChromeAuto.closeBrowser();
 ChromeAuto.printTitle();
	}
		
	}


