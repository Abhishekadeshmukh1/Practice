package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
		  
	    public static void main(String[] args) 
	    {  
	        
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	  
	    
  
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.verizonwireless.com/homepage/");
        
        //Below Actions are for moving mouse to My account drop-down
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("gnavAccountMenu"))).build().perform();

        //To Click sign in button
        driver.findElement(By.linkText("Sign In")).click();  
	          
	     
	      
	    }  
	  
	}  

