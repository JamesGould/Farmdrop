package techtest.farmdrop.screenobjects;

import org.openqa.selenium.support.PageFactory;

import techtest.farmdrop.util.AppiumUtil;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Screenobject extends AppiumUtil {

	public Screenobject() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
}
