package tests;

import org.testng.annotations.Test;

import core.BaseDriver;
import pages.homePage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class HomePageTest extends BaseDriver{
  
  @BeforeMethod
  public void beforeMethod() {
	  startSession();
	  PageFactory.initElements(driver, homePage.class);
  }
  
  @Test
  public void SingleInputFieldTest() throws InterruptedException {
	  System.out.println("SingleInputFieldTest");
	  homePage.EnterMessage.sendKeys("Motorola solutions");
	  homePage.MessageButton.click();
	  String text = homePage.Display.getText();
	  System.out.println("the text is: " + text);
	    }
  
  @Test
  public void SingleInputFieldTest2() throws InterruptedException {
	  System.out.println("SingleInputFieldTest2");
	  homePage.EnterMessage.sendKeys("shlomi");
	  homePage.MessageButton.click();
	  assertEquals("shlomi", homePage.Display.getText());
	  assertTrue( !homePage.Display.isDisplayed());

  }
  
  @AfterMethod
  public void afterMethod() {
	  //startSession();
  }

}
