package Facegenieautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginandlogoutfn {

	public static void main(String[] args) throws InterruptedException {
	
		// Set the path to the ChromeDriver executable
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		// Create a new instance of the ChromeDriver
	      WebDriver driver = new ChromeDriver();
	      
	      
	      // navigate refresh method
	      driver.navigate().refresh();
	
	   //Navigate to the Facegenie login page using GET method
	    driver.get("https://facegenie-ams-school.web.app/");
	    
	  //Maximize the window
	    driver.manage().window().maximize();
	    
	    //Enter emailaddress
	    WebElement Emailaddress = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	    Emailaddress.sendKeys("testbams@gmail.com");
	    
	    //Enter password
	    WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	    Password.sendKeys("facegenie");
	    
	    //Login
	    WebElement Login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/form[2]/button"));
	    Login.click();
	    
	    Thread.sleep(1000);
	    
	    //Logout
	    WebElement Logout = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[8]/div[2]/span"));
	    Logout.click();
	    
	    WebElement Logoutok = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/button[2]"));
	    Logoutok.click();
	    
	    
	  //Close the driver
		   driver.close();
	}

}
