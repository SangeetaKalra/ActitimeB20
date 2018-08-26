package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.BasePage;

public class GooglePagePO extends BasePage{

	public GooglePagePO(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='lst-ib']")
	private WebElement srcTxtBx;
	public WebElement scrTxtBx() {
		return srcTxtBx;
	}
	
	public void googleSrch(String value) {
		srcTxtBx.sendKeys(value);
		srcTxtBx.sendKeys(Keys.ENTER);
	}
	
	}

	

