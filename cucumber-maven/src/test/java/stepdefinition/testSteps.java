package stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testSteps {

	WebDriver driver;
	String loginwindow;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() throws IOException {	    
	
		System.setProperty("webdriver.chrome.driver","D:\\selenium class 20.12.2021\\selenium_jar_file_driver_browser\\chromedriver 98\\chromedriver.exe");
		driver=new ChromeDriver();			
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("user is on login page");
	}
	
	@When("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("satyawadekar@gmail.com");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("skw@2197");
	    loginwindow=driver.getWindowHandle();
	    driver.findElement(By.xpath("//button[@name='login']")).click();	    
	    
		System.out.println("user enters username and password");
	}
	
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() throws InterruptedException {
		
		System.out.println(driver.getTitle());		
		System.out.println("user logged successfully");
	}

	@When("User LogOut from the Application")
	public void user_log_out_from_the_application() throws InterruptedException {
		
		Thread.sleep(2000);
	
		//driver.findElement(By.xpath("//html//body//div[4]//div//div//div//div")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Log Out']"));
		System.out.println("user click on logout");
	}
	@Then("Message displayed LogOut Successfully")
	public void message_displayed_log_out_successfully() {
		System.out.println("user successfully logged out");
	driver.close();
	}
	
	
	@Given("This is a blank test")
	public void this_is_a_blank_test() {
	    System.out.println("example of tagDemo");
	}





	
}
