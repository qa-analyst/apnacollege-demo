package StaticNonStatic;

import java.text.DateFormat;
import java.util.Date;

public class ChromeAutomation {
	
	public String time;
	public static String browserName;
	
	public  void launchBrowser() throws InterruptedException {
		System.out.println(browserName);
		time=DateFormat.getDateTimeInstance().format(new Date());
		System.out.println("launching browser using time-"+time);
		Thread.sleep(2000);
		
	}
	public  void openUrl(String url) {
		
		System.out.println("Identifying Browser by "+time+" opening url"+url);
		
	}
	public  void printTitle() {
		System.out.println("Identifying Browser by "+time+" print the title");
		
	}
	public  void closeBrowser() {
		System.out.println("Identifying Browser by "+time+" closing browser");
		
	}

}
