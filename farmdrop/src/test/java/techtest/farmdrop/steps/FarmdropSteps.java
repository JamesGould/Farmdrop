package techtest.farmdrop.steps;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import techtest.farmdrop.screenobjects.FarmdropSO;

import techtest.farmdrop.screenobjects.FarmdropSO;
import techtest.farmdrop.util.AppiumUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FarmdropSteps extends AppiumUtil {

	@Given("^the app has been installed$")
	public void start_app() throws MalformedURLException
	{
		startApp();
	}
	
	@Then("^the Home screen will be displayed$")
	public void home_screen_displayed()
	{
		FarmdropSO screen = new FarmdropSO();
		assertTrue(screen.exists());
	}

	@When("^the Products button is tapped$")
	public void button_tapped(String buttonName)
	{
		FarmdropSO screen = new FarmdropSO();
		screen.tap_button(buttonName);
	}

	@Then("^the Products screen will be displayed$")
	public void screen_displayed(String screenName)	
	{
		FarmdropSO screen = new FarmdropSO();
		assertTrue(screen.which_screen_displayed(screenName));
	}
	
}