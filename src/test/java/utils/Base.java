package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import configs.BrowserConfig;
import configs.ConfigLoader;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class Base {
      public WebDriver driver;
      private ConfigLoader configLoader;
     
      public WebDriver getDriver() {
    	  String browserType = BrowserConfig.getBrowserType();
    	  if(driver == null) {
    		  loadConfigs();
    	  if(browserType.equalsIgnoreCase("chrome")) {
    		  ChromeOptions cOptions = new ChromeOptions();
    		  cOptions.addArguments("--headless=new");
    		  driver = new ChromeDriver(cOptions);
    	  }
    	  else if(browserType.equalsIgnoreCase("firefox")) {
    		  FirefoxOptions fOptions = new FirefoxOptions();
    		  //fOptions.addArguments("--headless");
    		  driver = new FirefoxDriver(fOptions);    		  
    	  }
    	  else if(browserType.equalsIgnoreCase("edge")) {
    		  EdgeOptions eOptions = new EdgeOptions();
    		  //eOptions.addArguments("--headless=new");
    		  driver = new EdgeDriver(eOptions);
    	  }
    	  	driver.get(configLoader.getBaseUrl());
    	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    	  	driver.manage().window().maximize();
    	  }
  	  	return this.driver;
      }
      public ConfigLoader getConfigs() {
    	  return configLoader;
      }
      
      public void loadConfigs(){    	  
    	  Properties prop = new Properties();
    	  configLoader = new ConfigLoader();
    	  String file = System.getProperty("user.dir")+"/src/test/resources/config.properties";
    	  try { 
    		  
    		  prop.load(new FileInputStream(new File(file)));
    		  configLoader.setBaseUrl(prop.getProperty("baseUrl"));
    		  
    	  }catch(FileNotFoundException fe) {
    		  fe.printStackTrace();
    	  }
    	  catch(IOException ioe) {
    		  System.out.println("IOException occured "+ ioe.getMessage());
    	  }
      }
}
