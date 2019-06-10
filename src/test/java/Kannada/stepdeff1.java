package Kannada;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdeff1 {
	WebDriver driver;
	@Given("User should login")
	public void user_should_login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.01\\Desktop\\java\\day1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("user search {string}")
	public void user_search(String string) {
		
		 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("User should logout")
	public void user_should_logout() {
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a")).click();
		 
	}

	@When("user Search {string}")
	public void user_Search(String string) {
		 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Laptop");
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
}
