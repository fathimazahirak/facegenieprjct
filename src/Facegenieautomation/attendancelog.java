package Facegenieautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class attendancelog {

	public static void main(String[] args) {
		
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
	    
	    //attendancelog click
	    WebElement attendancelog = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[2]/div[2]/span"));
	    attendancelog.click();
	    
	    //select dropbus
	    Select dropbus = new Select(driver.findElement(By.id("demo-simple-select-helper")));
		dropbus.selectByVisibleText("17");
		
		//select drop class 
		Select dropclass = new Select(driver.findElement(By.xpath("//*[@id=\"demo-simple-select-helper\"]")));
		dropclass.selectByVisibleText("class2");
		
	    //select start date
		WebElement date = driver.findElement(By.name("selectDate"));
	    date.click();
		
		//Select dropyear = new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		//dropyear.selectByIndex(3);
		
		//Select month = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
		//month.selectByValue("1");
		
		//Select date = new Select(driver.findElement(By.id("daybox")));
		//date.selectByIndex(10);
					
	}

}
