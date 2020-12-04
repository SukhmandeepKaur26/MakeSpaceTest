package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class PageObjects {
	WebDriver driver;
	
	
	@FindBy(how=How.CSS, using=(".hero-text [class='makespace-ui-library-14vob52 e1ws5ted1']"))
	public WebElement ZipCodeTxtbox;
	@FindBy(how=How.CSS, using=(".hero-text [class='e10p5ni92 makespace-ui-library-6tq67u emakht90']"))
	public WebElement SubmitZipcode;
	
	@FindBy(how=How.XPATH, using=("/html//main[@id='checkout']/div/div[2]/div[2]/div/div[1]/ul/li[2]/div/div[1]/div/div[3]/button[.='Select Plan']"))
	public WebElement SelectWalkinClosetplan;
	@FindBy(how=How.NAME, using = ("bin"))
	public WebElement BinNumber;
	@FindBy(how=How.CSS, using = ("[class='e7qrafw0 makespace-ui-library-1u2rjfu eet3dos0'] button"))
	public WebElement ContinuePlan;
	
	@FindBy(how=How.XPATH, using = ("/html//main[@id='checkout']/div/div[2]//button[.='Got it!']"))
	public WebElement GotItBtn;
	
	@FindBy(how=How.NAME, using = ("large-items"))
	public WebElement LargeItemsYes;
	@FindBy(how=How.ID, using = ("radio-bulky-items-_yes"))
	public WebElement BulkyItemsYes;
	@FindBy(how=How.ID, using = ("radio-walk-up-_yes"))
	public WebElement WalkUpYes;
	@FindBy(how=How.ID, using = ("radio-fragile-items-_yes"))
	public WebElement FragileItemsYes;
	@FindBy(how=How.ID, using = ("radio-disassembly-_yes"))
	public WebElement DisassemblyYes;
	@FindBy(how=How.XPATH, using = ("/html//main[@id='checkout']/div//button[@type='submit']"))
	public WebElement SubmitDetails;
	
	@FindBy(how=How.NAME, using = ("fullName"))
	public WebElement FullName;
	@FindBy(how=How.NAME, using = ("phone"))
	public WebElement Phone;
	@FindBy(how=How.NAME, using = ("email"))
	public WebElement Email;
	@FindBy(how=How.CSS, using = ("label[label='Yes']"))
	public WebElement RadioBtnArmedForces;
	@FindBy(how=How.CSS, using = ("[class='css-1jmtuu16 makespace-ui-library-1gd3jm6 emakht90']"))
	public WebElement ContinueAccntSignUp;
	
	@FindBy(how=How.NAME, using = ("address_pretty"))
	public WebElement AppointmentAddress;
	@FindBy(how=How.XPATH, using = ("//input[@placeholder='Optional']"))
	public WebElement FloorNumber;
	@FindBy(how=How.CSS, using = (".css-hovad90.makespace-ui-library-1sre8bb > .css-hovad93.emakht90.makespace-ui-library-m8ddco"))
	public WebElement CnfrmContinueAddress;
	
	@FindBy(how=How.CSS, using = ("[class='makespace-ui-library-1dee5ie']"))
	public WebElement AppointmentDateHolder;
	@FindBy(how=How.CSS, using = ("[aria-label='day-17']"))
	public WebElement AppointmentDate;	
	@FindBy(how=How.NAME, using = ("Time"))
	public WebElement AppointmentTime;
	@FindBy(how=How.CSS, using = ("[class='css-1epi29r1 makespace-ui-library-1ggztnq emakht90']"))
	public WebElement CnfrmAppntmntTime;
	
	
	@FindBy(how=How.CSS, using = (".InputContainer > input[name='cardnumber']"))
	public WebElement CardNumber;
	@FindBy(how=How.CSS, using = (".InputContainer > input[name='exp-date']"))
	public WebElement ExpDate;	
	@FindBy(how=How.CSS, using = ("input[name='cvc']"))
	public WebElement CVC;
	@FindBy(how=How.CSS, using = ("input[name='card-name']"))
	public WebElement CardName;
	
	@FindBy(how=How.CSS, using = ("[class='makespace-ui-library-14ovu1w e1ovri130']"))
	public WebElement TCRadioBtn;
	@FindBy(how=How.XPATH, using = ("/html//main[@id='checkout']/div//button[.='Confirm and book my appointment']"))
	public WebElement ConfirmBookBtn;
	
	@FindBy(how=How.XPATH, using = ("//main[@id='checkout']/div/div[1]/ul//a[@href='/book/']/span[.='Plans']"))
	public WebElement PlanNavigation;
	@FindBy(how=How.CSS, using = ("[class='makespace-ui-library-ppe1gg css-12x7alu0'] [class] div:nth-of-type(1)"))
	public WebElement AssertAppointmentDate;
	@FindBy(how=How.CSS, using = ("//div[@id='js-pbi-header']//span[@class='bold']"))
	public WebElement AssertAppointmentDate2;
	
	@FindBy(how=How.LINK_TEXT, using = ("Log in"))
	public WebElement LogInPopup;
	
	
	
	public PageObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}

	public void goToUrl() {
	  driver.get("https://dev.mksp.co/");
	}
	
	/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Banner);	
		
		Select drpProvince = new Select(driver.findElement(By.cssSelector("Select")));
	drpProvince.selectByVisibleText("Ontario");
		*/
	
	public void  SelectPlan() throws InterruptedException {
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("window.scrollBy(0,200)");
		 SelectWalkinClosetplan.click();
		 Thread.sleep(2000);
		 BinNumber.sendKeys("4");
		 ContinuePlan.click();
		 GotItBtn.click();
	
}
public void enterDetails() {
		
		/*element = WebDriverWait(browser, 20).until(EC.presence_of_element_located((By.XPATH, "//div/button[@id='qa-guest-checkout-mobile']")))
			browser.execute_script("arguments[0].click();", element)
		WebDriverWait wait = new WebDriverWait(driver, 20);
	    WebElement ALargeItemsYes = wait.until(ExpectedConditions.elementToBeClickable(LargeItemsYes));
	    ALargeItemsYes.click();*/
	    JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].click();", LargeItemsYes);
		javascript.executeScript("arguments[0].click();", BulkyItemsYes);
		javascript.executeScript("arguments[0].scrollIntoView();", SubmitDetails);
		javascript.executeScript("arguments[0].click();", WalkUpYes);
		javascript.executeScript("arguments[0].click();", FragileItemsYes);
		javascript.executeScript("arguments[0].click();", DisassemblyYes);
		SubmitDetails.click();
		
	}
	
	public void accountAndAddressDetails() throws InterruptedException {
		FullName.sendKeys("Yes");
		Phone.sendKeys("1234567890");
		Email.sendKeys("a@test.com");
		RadioBtnArmedForces.click();
		ContinueAccntSignUp.click();
		AppointmentAddress.sendKeys("123 William ");
	    Thread.sleep(2000);
	    AppointmentAddress.sendKeys(Keys.ARROW_DOWN);
	    AppointmentAddress.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    //FloorNumber.sendKeys("Floor 22");
	    /*{
	      WebElement element = driver.findElement(By.cssSelector(".css-hovad92"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
		}*/
	    JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].scrollIntoView();",CnfrmContinueAddress );
		Thread.sleep(2000);
		CnfrmContinueAddress.click();
		Thread.sleep(2000);
	}
	
	public void appointmentDateTime() throws InterruptedException {
		AppointmentDateHolder.click();
		AppointmentDate.click();
		Thread.sleep(2000);
		AppointmentTime.click();
		AppointmentTime.sendKeys(Keys.ARROW_DOWN);
		AppointmentTime.sendKeys(Keys.ENTER);
		
		
		/*Actions action = new Actions(driver);    
		action.moveToElement(AppointmentTime);

		List<WebElement> options = driver.findElements(By.cssSelector("makespace-ui-library-ojqyia e13hbxyi2"));
		for(WebElement option : options) {
		    if (option.getText().equals("12pm-3pm")) {
		        option.click();
		    }
		}*/
		CnfrmAppntmntTime.click();
	}
	public void cardDetails() throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		CardNumber.sendKeys("4111111111111111");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		ExpDate.sendKeys("02/22");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		CVC.sendKeys("222");
		driver.switchTo().defaultContent();
		//CardName.clear();
		//CardName.sendKeys("Sajjid Hossain");
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("window.scrollBy(0,300)");		
	}
	
	public void confirmAndBook(){
		 TCRadioBtn.click();
	    ConfirmBookBtn.click();
	    if (LogInPopup.isDisplayed()){
	    	LogInPopup.click();
	    	System.out.println("Unable to log in - bugs");    	
	    }
	    else {
	    	assertionDate();
		    assertionTitle();
	    }
	}
	
	public  void assertionDate() {
		String Expected = AssertAppointmentDate2.getText();
		System.out.println(Expected);
		String Actual = "Thursday, December 17th";
		Assert.assertEquals(Expected, Actual);
		
}
	
	public  void assertionPlan() {
		String Expected = PlanNavigation.getText();
		System.out.println(Expected);
		String Actual = "Plans";
		Assert.assertEquals(Expected, Actual);
}
	public  void assertionTitle() {
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	String expectedTitle = "Booking Inventory | MakeSpace";
	Assert.assertEquals(expectedTitle,actualTitle);
	}
	
	
	public void closeDriver() {
		//driver.close();
		driver.quit();
		
	}
}
	
	
