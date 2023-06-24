package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitiontest {

	/*@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("Print1 ");
	}

	@And("some other precondition")
	public void some_other_precondition() {
	    System.out.println("Print2");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("Print3");
	}

	@And("some other action")
	public void some_other_action() {
		System.out.println("Print4");
	}

	@And("yet another action")
	public void yet_another_action() {
		System.out.println("Print5");
	}*/
	WebDriver driver;
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aruna.saripalli\\Desktop\\Learn\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
	}

	@Then("click on signin")
	public void click_on_signin() {
		driver.findElement(By.className("signin")).click();
	}

	@Then("user enters emailid")
	public void user_enters_emailid() {
		driver.findElement(By.id("login1")).sendKeys("Achds");
		
	}

	@And("user enters password")
	public void user_enters_password() {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password122");
	}

	@Then("click on login")
	public void click_on_login() {
		driver.findElement(By.className("signinbtn")).click();
	}






}
