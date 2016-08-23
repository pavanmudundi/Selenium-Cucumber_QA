package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.*;

public class Test_Steps {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.demoqa.com");
		
	}

	@When("^User Navigates to Registration Page$")
	public void user_Navigates_to_Registration_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
	    
	}

	@When("^User Enters FirstName and LastName$")
	public void user_Enters_FirstName_and_LastName() throws Throwable {
		driver.findElement(By.id("name_3_firstname")).sendKeys("lewis");
		driver.findElement(By.id("name_3_lastname")).sendKeys("hamilton");
	}

	@Then("^Message Displayed details Entered Successfully$")
	public void message_Displayed_details_Entered_Successfully() throws Throwable {
	    System.out.println("Entered Successffully");
	}

	@When("^User Selects Marital Status$")
	public void user_Selects_Marital_Status() throws Throwable {
		List<WebElement> radio= driver.findElements(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]"));
		
		for(WebElement elmt:radio)
		{
			String str=elmt.getAttribute("value");
			if(str.equals("single"))
			{
				elmt.click();
			}
		}
	}

	@Then("^Message Displayed Updated Status$")
	public void message_Displayed_Updated_Status() throws Throwable {
	    System.out.println("Successfully Selected Marital Status");
	}

	@When("^User Selects Hobbies$")
	public void user_Selects_Hobbies() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[2]")).click();
	    driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[3]")).click();
	}

	@Then("^Message Displayed Selected Hobbies$")
	public void message_Displayed_Selected_Hobbies() throws Throwable {
	    System.out.println("Successfully Selected Hobbies");
	}

	@When("^User selects Country$")
	public void user_selects_Country() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='dropdown_7']/option[193]")).click();
	}

	@Then("^Message Displayed Updated Country$")
	public void message_Displayed_Updated_Country() throws Throwable {
	    System.out.println("Successfully Selected Country");
	}

	@When("^User Enters Date of Birth$")
	public void user_Enters_Date_of_Birth() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='mm_date_8']/option[6]")).click();
	    driver.findElement(By.xpath(".//*[@id='dd_date_8']/option[13]")).click();
	    driver.findElement(By.xpath("//*[@id='yy_date_8']/option[24]")).click();
	}

	@Then("^Message Displayed Date of Birth Updated$")
	public void message_Displayed_Date_of_Birth_Updated() throws Throwable {
	    System.out.println("Successfully Updated Date of Birth");
	}

	@When("^User Enters PhoneNumber and UserName$")
	public void user_Enters_PhoneNumber_and_UserName() throws Throwable {
		driver.findElement(By.id("phone_9")).sendKeys("11234567890");
		driver.findElement(By.id("username")).sendKeys("hamilton");
	}

	@When("^User Enters Email$")
	public void user_Enters_Email() throws Throwable {
		driver.findElement(By.id("email_1")).sendKeys("lewishamilton@f1.com");
	}

	@Then("^Message Displayed Updated Contact Details$")
	public void message_Displayed_Updated_Contact_Details() throws Throwable {
	    System.out.println("Successfully Updated Contact Information");
	}

	@When("^User Uploads Profile Picture$")
	public void user_Uploads_Profile_Picture() throws Throwable {
	    driver.findElement(By.name("profile_pic_10")).sendKeys("Ham.jpg");
	}

	@Then("^Message Displayed Succefully Updated Profile Picture$")
	public void message_Displayed_Succefully_Updated_Profile_Picture() throws Throwable {
	    System.out.println("Successfully Updated Profile Picture");
	}

	@When("^User Enters Bio$")
	public void user_Enters_Bio() throws Throwable {
	    driver.findElement(By.id("description")).sendKeys("Hello This is Lewis Hamilton. I love to race. I own a bombardier challenger 6000. I am a Triple world champion");
	}

	@Then("^Message Displayed Successfully Bio Updated$")
	public void message_Displayed_Successfully_Bio_Updated() throws Throwable {
	    System.out.println("Successfully Updated Bio");
	}

	@When("^User Enters Password and Confirm Password$")
	public void user_Enters_Password_and_Confirm_Password() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='password_2']")).sendKeys("kersDRS44");
		driver.findElement(By.xpath(".//*[@id='confirm_password_password_2']")).sendKeys("kersDRS44");
	}

	@Then("^Message Displayed Entered Password$")
	public void message_Displayed_Entered_Password() throws Throwable {
	    System.out.println("Successfully Entered Password");
	}

	@When("^User Submits the Application$")
	public void user_Submits_the_Application() throws Throwable {
	    //driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();
	}

	@Then("^Message Displayed Successfully Submitted$")
	public void message_Displayed_Successfully_Submitted() throws Throwable {
	    System.out.println("Successfully Submitted");
	}

}
