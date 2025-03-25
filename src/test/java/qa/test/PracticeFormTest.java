package qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
		Pattern ChooseFileButton = new Pattern(filepath + "ChooseFileButton.png");
		Pattern CloseButton = new Pattern(filepath + "CloseButton.png");
		Pattern CurrentAddress = new Pattern(filepath + "CurrentAddress.png");
		Pattern DateOfBirth = new Pattern(filepath + "DateOfBirth.png");
		Pattern Email = new Pattern(filepath + "Email.png");
		Pattern FemaleRadioButton = new Pattern(filepath + "FemaleRadioButton.png");
		Pattern MaleRadioButton = new Pattern(filepath + "MaleRadioButton.png");
		Pattern MusicCheckbox = new Pattern(filepath + "MusicCheckbox.png");
		Pattern OtherRadioButton = new Pattern(filepath + "OtherRadioButton.png");
		Pattern ReadingCheckbox = new Pattern(filepath + "ReadingCheckbox.png");
		Pattern SelectState = new Pattern(filepath + "SelectState.png");
		Pattern SportsCheckBox = new Pattern(filepath + "SportsCheckBox.png");
		Pattern Subject = new Pattern(filepath + "Subject.png");
		Pattern SubmitButton = new Pattern(filepath + "SubmitButton.png");
		Pattern ThanksForSubmitMessage = new Pattern(filepath + "ThanksForSubmitMessage.png");
		Pattern MobileNumber = new Pattern(filepath + "MobileNumber.png");
		Screen s = new Screen();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		try {
			s.type(firstNameTextBox,"Vrushali");
			
			s.type(lastNameTextBox,"Patil");
			
			s.type(Email,"vp@gmail.com");
			
			s.click(FemaleRadioButton);
			
			
			s.type(MobileNumber,"1234567890");
			
			
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
