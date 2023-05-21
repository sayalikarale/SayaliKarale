package pageObjectModelPackage;

import java.io.IOException;

public class ValidTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readpropertyfile(PROPERTY_PATH, "username"),
				flib.readpropertyfile(PROPERTY_PATH, "password"));
		bt.tearDown();
	}


}