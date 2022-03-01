package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	
	@Given("user is on Loginpage")
	public void user_is_on_loginpage() {
		System.out.println("Step1: user is on Loginpage");
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	@When("user enters Username and Password")
	public void user_enters_username_and_password() {
		System.out.println("Step2: user enters Username and Password");
	    driver.findElement(By.id("txtUsername")).sendKeys("admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@And("click on Login button")
	public void click_on_login_button() {
		System.out.println("Step3: click on Login button");
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("Step4: user should land on home page");
	    String homePageValidation= driver.findElement(By.xpath("//div[@id='branding']/a[@id='welcome']")).getText();
	    if(homePageValidation.contains("Welcome")) {
	    	System.out.println("User logged in Successfully");
	    }else {
	    	System.out.println("User unable to log in");
	    }
	    
	    driver.close();
	}
}
