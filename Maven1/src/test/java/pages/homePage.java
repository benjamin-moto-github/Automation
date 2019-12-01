package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {
	WebDriver driver;
	//enter message
	@FindBy (xpath = "//input[@type='text' and @id='user-message']")
	public static WebElement EnterMessage;
	
	//message button
	@FindBy (xpath = "//*[@id='get-input']/button")
	public static WebElement MessageButton;
	
	//Displayed message
	@FindBy (id = "display")
	public static WebElement Display;

}
