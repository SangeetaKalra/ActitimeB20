package testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.LinkedInGoogleResultPO;

public class LinkedInTest extends BaseTest{

	
	@Test
	public void linkedinTest(){
		try {
			GooglePagePO googlePO = new GooglePagePO(driver);
			googlePO.googleSrch("LinkedIn");
			LinkedInGoogleResultPO liGoPO = new LinkedInGoogleResultPO(driver);
			Reporter.log("Total number of links=" + liGoPO.allLinkssize(), true);
			liGoPO.liSrchResLink().click();
			String eTitle = "Sign Up | LinkedIn";
			liGoPO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {

			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}

	}
}
