package Kannada;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdeff {
	
	WebDriver driver;
	@Given("Users opens Testmeapp")
	public void users_opens_Testmeapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.01\\Desktop\\java\\day1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("Enter usernamre {string}")
	public void enter_usernamre(String string) { 
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
	}

	@When("enter password {string}")
	public void enter_password(String string) {
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	}

	@When("Click login button")
	public void click_login_button() {
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("Close application")
	public void close_application() {
		driver.close();
	}

}
