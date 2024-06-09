package StaticNonStatic;

public class Usage {

	public static void main(String[] args) throws InterruptedException {
		ChromeAutomation.launchBrowser();
		ChromeAutomation.openUrl(" https://facebook.com");
		ChromeAutomation.printTitle();
		ChromeAutomation.closeBrowser();
		
		ChromeAutomation.launchBrowser();
		ChromeAutomation.openUrl(" https://flipkart.com");
		ChromeAutomation.printTitle();
		ChromeAutomation.closeBrowser();
		



	}

}
