package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutility.BaseLibrary;

public class Text_box_page  extends BaseLibrary{
	
	public Text_box_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement textbox;
	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement name;
	@FindBy(xpath = "//input[@id='fullemail1']")
	private WebElement emailbox;

	public void clickOnPractice()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", practice);
		practice.click();
	}
	public void clickOnClose()
	{
		close.click();
	}
	public void clickOnElement()
	{
		element.click();
	}
	public void clickOnTextBox()
	{
		textbox.click();
	}
	public void clickOnNameBox()
	{
		name.sendKeys("phiroz");
	}
	
	
	
	

}
