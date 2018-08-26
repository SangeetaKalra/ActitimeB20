package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class LinkedInGoogleResultPO extends BasePage{
	public LinkedInGoogleResultPO(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a")
	private List<WebElement> allLinks;

	public int allLinkssize() {
		return allLinks.size();
	}

	@FindBy(xpath = "//a[text()='Join LinkedIn']")
	private WebElement liSrchResLink;

	public WebElement liSrchResLink() {
		return liSrchResLink;
	}
}
