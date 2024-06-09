package StaticNonStatic;

import java.text.DateFormat;
import java.util.Date;

public class NonStaticObj1 {

public  String time; //
	
	public static void launchBrowser() throws InterruptedException {
	    time=DateFormat.getDateTimeInstance().format(new Date());
		System.out.println("launching browser by time"+time);
		Thread.sleep(2000);
		}
	public static void openUrl(String url) {	
	
		System.out.println("identifying browser by time"+time+" opening url by "+url);
		
	}
	public static void printTitle() {
		System.out.println("identifying browser by time"+time+" print the title");
		
	}
	public static void closeBrowser() {
		System.out.println("identifying browser by time"+time+" closing the browser");
		
	}
}


