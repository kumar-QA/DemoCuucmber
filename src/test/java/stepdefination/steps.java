package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
   
	WebDriver driver ;
	
	@Given("launch the browser and enter url")
	public void launch_the_browser_and_enter_url() {
	    driver=new ChromeDriver();
	    driver.get("https://admin-demo.nopcommerce.com/login");
	    driver.manage().window().maximize();
	}

	@When("I Enter valid username")
	public void i_enter_valid_username() {
	   driver.findElement(By.name("Email")).clear();
	   driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	}

	@When("I Enter  valid password")
	public void i_enter_valid_password() {
	   driver.findElement(By.name("Password")).clear();
	   driver.findElement(By.name("Password")).sendKeys("admin");
	}

//	@Then("click  on login Btn")
//	public void click_on_login_btn() {
//		driver.findElement(By.className("login-button")).click();
//	   	}


}
