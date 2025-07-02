package utils;
import configs.ConfigLoader;

import org.openqa.selenium.WebDriver;
import pages.LaunchPageOld;
import pages.Loginpage;
import pages.PremiumUserHomepage;
import pages.CommanHomePage_MealSection;
import pages.CommanHomePage;
import pages.ExercisePage;
import pages.ExerciseFullPage;

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
	
	public CommanHomePage_MealSection getCommanHomePage_MealSection() {
		commanHomePage_MealSection = new CommanHomePage_MealSection(this.driver);
		return commanHomePage_MealSection;
		
	}
	
	
	
}
