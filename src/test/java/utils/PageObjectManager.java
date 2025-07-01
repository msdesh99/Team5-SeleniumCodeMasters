package utils;
import configs.ConfigLoader;
import org.openqa.selenium.WebDriver;
import pages.LaunchPageOld;
import pages.Launchgpage1;
import pages.Loginpage;

import pages.PdFfileUploadPage;

import pages.NonFunctionalPage;

import pages.PremiumUserHomepage;
import pages.CommanHomePage;
import pages.ExercisePage;
import pages.HomeNavigation;
import pages.ExerciseFullPage;

public class PageObjectManager {
    ConfigLoader configLoader;
    WebDriver driver;
    private LaunchPageOld launchPage; 
    private Loginpage loginpage; 
    private PremiumUserHomepage premiumuserhomepage; 
    private ExercisePage exercisePage;
    private CommanHomePage commanhomepage;
    private ExerciseFullPage exerciseFullPage;
    private PdFfileUploadPage pdfuploadpage;



    private Launchgpage1 launchPageobj;
    private HomeNavigation homepageObj;
    private NonFunctionalPage nonfunctionalObj;
    
	public PageObjectManager(ConfigLoader configLoader, WebDriver driver) {
		this.driver = driver;
		this.configLoader = configLoader;		
	}
	public LaunchPageOld getLaunchPage() {
		launchPage = new LaunchPageOld(this.driver);
		return launchPage;
		//return new LaunchPage(this.driver);
	}	
	public Loginpage getLoginpage() {
		loginpage = new Loginpage(this.driver);
		return loginpage;		
	}
	public ExercisePage getExercisePage() {
		exercisePage = new ExercisePage(this.driver);
		return exercisePage;
	}
	public ExerciseFullPage getExerciseFullPage() {
		exerciseFullPage = new ExerciseFullPage(this.driver);
		return exerciseFullPage;
	}
	public PremiumUserHomepage getPremiumUserHomepage() {
		premiumuserhomepage = new PremiumUserHomepage(this.driver);
		return premiumuserhomepage;		
	}
	
	public CommanHomePage getCommanHomePage() {
		commanhomepage = new CommanHomePage(this.driver);
		return commanhomepage;
		
	}

	public PdFfileUploadPage getPdFfileUploadPage() {
		pdfuploadpage = new PdFfileUploadPage(this.driver);
		return pdfuploadpage;		

	}	
	

	public Launchgpage1 getLaunchpage1() {
		launchPageobj = new Launchgpage1(this.driver);
		return launchPageobj;
		//return new LaunchPage(this.driver);
	}
	public  HomeNavigation getHomeNavigation() {
		homepageObj = new HomeNavigation(this.driver);
		return homepageObj;
	}
	public NonFunctionalPage getNonFunctionalPage() {
	   nonfunctionalObj = new NonFunctionalPage(this.driver);
	  return nonfunctionalObj;
	}
}
