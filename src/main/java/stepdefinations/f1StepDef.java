package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class f1StepDef 
{
	@Given("Open the Firefox and launch the application")
	public void f1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91819\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/inputs");
		System.out.println("Step29");
		
	}
	
	@When("Enter the Username and Password")
	public void f2()
	{
		System.out.println("Step10");
	}
	
	@Then("Reset the credential")
	public void f3()
	{
		System.out.println("Step3");
	}

}
