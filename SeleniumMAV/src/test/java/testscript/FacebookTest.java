package testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.FacebookGoogleResultPO;
import pom.GooglePagePO;

public class FacebookTest extends BaseTest {

	@Test
	public void facebookTest(){
		try {
			GooglePagePO googlePO = new GooglePagePO(driver);
			googlePO.googleSrch("Facebook");
			FacebookGoogleResultPO fbGoPO = new FacebookGoogleResultPO(driver);
			Reporter.log("Total number of links=" + fbGoPO.allLinkssize(), true);
			fbGoPO.fbSrchResLink().click();
			String eTitle = "Facebook – log in or sign up";
			fbGoPO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {

			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}

	}
}
