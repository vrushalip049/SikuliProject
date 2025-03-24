package qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeFormTest {
	WebDriver driver;
	private String filepath = "C:\\Users\\Admin\\2025_eclipse-Automationworkspace\\SikuliProject\\src\\test\\rescources\\Images\\";

	@BeforeMethod

	public void Setup() {
		/*
		 * https://demoqa.com/automation-practice-form https://demoqa.com/
		 */
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// launch chrome
		driver.get("https://demoqa.com/automation-practice-form");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
	}

	@Test
	public void formRegistrationTest() {

		Pattern firstNameTextBox = new Pattern(filepath + "FirstName.png");
		Pattern lastNameTextBox = new Pattern(filepath + "LastName.png");
		
		Screen s = new Screen();
	
	
		try {
			s.type(firstNameTextBox,"Vrushali");
			
			s.type(lastNameTextBox,"Patil");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}
