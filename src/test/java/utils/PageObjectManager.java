package utils;
import configs.ConfigLoader;

import org.openqa.selenium.WebDriver;
import pages.CommanHomePage;
import pages.LaunchPage;
import pages.Loginpage;

public class PageObjectManager {
    ConfigLoader configLoader;
    WebDriver driver;
    private LaunchPage launchPage; 
    private Loginpage loginpage; 
    private CommanHomePage commanhomepage;
    
	public PageObjectManager(ConfigLoader configLoader, WebDriver driver) {
		this.driver = driver;
		this.configLoader = configLoader;		
	}
	public LaunchPage getLaunchPage() {
		launchPage = new LaunchPage(this.driver);
		return launchPage;
		//return new LaunchPage(this.driver);
	}
	
	public Loginpage getLoginpage() {
		loginpage = new Loginpage(this.driver);
		return loginpage;
		
	}
	
	public CommanHomePage getCommanHomePage() {
		commanhomepage = new CommanHomePage(this.driver);
		return commanhomepage;
		
	}
	
}
