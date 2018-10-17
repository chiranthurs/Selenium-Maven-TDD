package com.edu.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// TODO: Auto-generated Javadoc
/**
 * The Class CastorLoginPageUI.
 */
public class CastorLoginPageUI extends BasePage {

	/** The driver. */
	WebDriver driver;

	
	/**
	 * Instantiates a new castor login page UI.
	 *
	 * @param driver the driver
	 */
	public CastorLoginPageUI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/** The Drpdwn exm. */
	@FindBy(id = "example")
	public WebElement Drpdwn_exm;

	/** The lnk down. */
	@FindBy(xpath = "//*[@id='columnMain']//a")
	public List<WebElement> lnk_down;
	



	/** The lnk studname. */
	@FindBy(xpath = "//a[contains(@class,'ngCellText ') and contains(@ng-click,'navigateToSpecificStudent')]")
	public List<WebElement> lnk_studname;
	
	/**
	 * Gets the button sign IN.
	 *
	 * @return the button sign IN
	 */
	public WebElement get_ButtonSignIN(){
		return expWait.getWhenClickable(By.xpath("//*[@value='Log in']"), 10);
	}
	
	/**
	 * Gets the txt username.
	 *
	 * @return the txt username
	 */
	public WebElement get_Txt_Username(){
		return expWait.getWhenClickable(By.xpath("//*[@name='username']"), 120);
	}
	
	/**
	 * Gets the txt password.
	 *
	 * @return the txt password
	 */
	public WebElement get_Txt_Password(){
		return expWait.getWhenClickable(By.xpath("//*[@name='password']"), 60);
	}
	
	public WebElement get_ProductDevlopmentTab(){
		return expWait.getWhenClickable(By.xpath("//*[text()='Product Developments']"), 20);
	}
	
	
	
}
