package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjects;

public class PageObjectManager {
	
	private WebDriver driver;
	PageObjects PageObjects;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public PageObjects getPageObjects() {
		return(PageObjects==null)? new PageObjects(driver):PageObjects;
	}
	
}

