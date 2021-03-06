package techtest.farmdrop.screenobjects;

import io.appium.java_client.ios.IOSElement;

public class FarmdropSO extends Screenobject {

	public Boolean exists()
	{	
		return checkElementDisplayed(waitUntillTappable(homeScreen));
	}

	public void tap_button(String buttonName) {

		switch (buttonName) {
		case "Products":
			tap_button(productsButton);
		case "Reciepes":
			tap_button(reciepesButton);
		case "Account":
			tap_button(accountButton);
		case "Basket":
			tap_button(basketButton);
		}
	}
	
	public Boolean which_screen_displayed(String screenName)
	{
		switch (screenName) {
		case "Products":
			return checkElementDisplayed(waitUntillTappable(productsScreen));
		case "Reciepes":
			return checkElementDisplayed(waitUntillTappable(reciepesScreen));
		case "Account":
			return checkElementDisplayed(waitUntillTappable(accountScreen));
		case "Basket":
			return checkElementDisplayed(waitUntillTappable(basketScreen));
		}
		return false;
	}
	
}
