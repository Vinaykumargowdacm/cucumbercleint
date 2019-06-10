package Kannada;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdeff3 {
	WebDriver driver;
	@Given("user do login")
	public void user_do_login() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.01\\Desktop\\java\\day1\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		 driver.get("http://10.232.237.143:443/TestMeApp/");
////		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
//		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("lalitha");
//		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
//		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
//		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("1");
	}

	@When("search product")
	public void search_product()  throws InterruptedException {
//		 Actions actions=new Actions(driver);
//		 actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"))).click().perform();
//		 Thread.sleep(1000);
//		 actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"))).click().perform();
//		 Thread.sleep(1000);
//		 actions.moveToElement(driver.findElement(By.xpath(	"//*[@id=\"submenuul11290\"]/li[1]/a/span"))).click().perform();	 
//		 Thread.sleep(1000);
		System.out.println("2");
	}

	@When("Add to cart")
	public void add_to_cart() {
//		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
//		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
//		 driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a/i")).click();
		System.out.println("3");
		 
	}

	@When("Select payment option")
	public void select_payment_option() {
//		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
//		 WebElement radioBtn=driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i"));
//	 radioBtn.click();
//	 driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		System.out.println("4");
	}

	@When("Make payment")
	public void make_payment() {
//		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("Trans@456");
//		 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("pass@456");
//		 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		System.out.println("5");
	}

	@When("Close Test me application")
	public void close_Test_me_application() {
//		driver.close();
		System.out.println("6");
	}

}
