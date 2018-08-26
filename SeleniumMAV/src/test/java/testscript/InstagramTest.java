package testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.GooglePagePO;
import pom.InstagramGoogleResultPO;

public class InstagramTest extends BaseTest{
	
	@Test
	public void instagramTest(){
		try {
			GooglePagePO googlePO = new GooglePagePO(driver);
			googlePO.googleSrch("Instagram");
			InstagramGoogleResultPO inGoPO = new InstagramGoogleResultPO(driver);
			Reporter.log("Total number of links=" + inGoPO.allLinkssize(), true);
			inGoPO.inSrchResLink().click();
			String eTitle = "Instagram";
			inGoPO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {

			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}

	}
	
	}




