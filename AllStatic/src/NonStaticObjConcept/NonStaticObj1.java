package NonStaticObjConcept;

import java.text.DateFormat;
import java.util.Date;

public class NonStaticObj1 {

public  String time; //
public static String BrowserName;  //non static
	
	public  void launchBrowser() throws InterruptedException {
	    time=DateFormat.getDateTimeInstance().format(new Date());
		System.out.println("launching browser by time"+time);
		Thread.sleep(2000);
		}
	public  void openUrl(String url) {	
	
		System.out.println("identifying browser by time"+time+" opening url by "+url);
		
	}
	public void printTitle() {
		System.out.println("identifying browser by time"+time+" print the title");
		
	}
	public  void closeBrowser() {
		System.out.println("identifying browser by time"+time+" closing the browser");
		
	}
}


