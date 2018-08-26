package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class InstagramGoogleResultPO extends BasePage {
	public InstagramGoogleResultPO(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a")
	private List<WebElement> allLinks;

	public int allLinkssize() {
		return allLinks.size();
	}

	@FindBy(xpath = "//a[text()='Instagram']")
	private WebElement inSrchResLink;

	public WebElement inSrchResLink() {
		return inSrchResLink;
	}
}
