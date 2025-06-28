package configs;

public class BrowserConfig {
	private static String browserType;
	
	public static void setBrowserType(String browser) {
		browserType = browser;	
	}
	public static String getBrowserType() {
			if(browserType==null) 
				throw new RuntimeException ("Browser is not specified in testng.xml file"); 
		    return browserType;
   }
}	
