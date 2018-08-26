package testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.TwitterGoogleResultPO;

public class TwitterTest extends BaseTest {

	@Test
	public void twitterTest() {
		try {
			GooglePagePO googlePO = new GooglePagePO(driver);
			googlePO.googleSrch("Twitter");
			TwitterGoogleResultPO twGoPO = new TwitterGoogleResultPO(driver);
			Reporter.log("Total number of links=" + twGoPO.allLinkssize(), true);
			twGoPO.twSrchResLink().click();
			String eTitle = "Login on Twitter";
			twGoPO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {

			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}

	}
}
