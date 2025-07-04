package utils;
import configs.ConfigLoader;


import org.openqa.selenium.WebDriver;
import pages.LaunchPageOld;
import pages.Launchgpage1;
import pages.Loginpage;
import pages.PdFfileUploadPage;
//import pages.NonFunctionalPage;
import pages.PremiumUserHomepage;
import pages.CommanHomePage_MealSection;
import pages.StepthroughonboardingPage;
import pages.CommanHomePage;
import pages.ExercisePage;
import pages.HomeNavigation;
import pages.ExerciseFullPage;
import pages.PremiumUserLogbookPage;

public class PageObjectManager {
  
    ConfigLoader configLoader;
    WebDriver driver;
  
    private LaunchPageOld launchPage; 
    private Loginpage loginpage; 
    private PremiumUserHomepage premiumuserhomepage; 
    private ExercisePage exercisePage;
    private ExerciseFullPage exerciseFullPage;
    private CommanHomePage commanhomepage;
    private CommanHomePage_MealSection commanHomePage_MealSection;
    private PdFfileUploadPage pdfuploadpage;
    private Launchgpage1 launchPageobj;
    private HomeNavigation homepageObj;
   // private NonFunctionalPage nonfunctionalObj;
    private PremiumUserLogbookPage premiumUserLogbookPage;

    private StepthroughonboardingPage stepthroughonboardingpage;

    
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
	public PremiumUserLogbookPage getPremiumUserLogbookPage() {
		premiumUserLogbookPage = new PremiumUserLogbookPage(this.driver);
		return premiumUserLogbookPage;
	}
	public PremiumUserHomepage getPremiumUserHomepage() {
		premiumuserhomepage = new PremiumUserHomepage(this.driver);
		return premiumuserhomepage;		

	}
		public CommanHomePage getCommanHomePage() {
		commanhomepage = new CommanHomePage(this.driver);
		return commanhomepage;
	}
	
	 public CommanHomePage_MealSection getCommanHomePage_MealSection() {
		commanHomePage_MealSection = new CommanHomePage_MealSection(this.driver);
		return commanHomePage_MealSection;
		
	}
	
	public PdFfileUploadPage getPdFfileUploadPage() {
		pdfuploadpage = new PdFfileUploadPage(this.driver);
		return pdfuploadpage;		
	}	


	public StepthroughonboardingPage getstepthroughonboarding() {
		stepthroughonboardingpage= new StepthroughonboardingPage(this.driver);
		return stepthroughonboardingpage;		

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
//	public NonFunctionalPage getNonFunctionalPage() {
//	   nonfunctionalObj = new NonFunctionalPage(this.driver);
//	  return nonfunctionalObj;
//	}	

}
