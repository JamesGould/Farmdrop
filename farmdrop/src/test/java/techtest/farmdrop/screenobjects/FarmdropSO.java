package techtest.farmdrop.screenobjects;

import io.appium.java_client.ios.IOSElement;

public class FarmdropSO extends Screenobject {

	public Boolean exists(String screenName) {
		return checkElementDisplayed(waitUntillTappable(screenName));
	}

}
