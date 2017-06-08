Feature: Farmdrop Sign Up

Scenario: App launches successfully
	Given the app has been installed
	Then the Home screen will be displayed

Scenario Outline: Tapping on menu options loads the correct page
	Given the Home screen is being displayed
	When the <screenName> button is tapped
	Then the <screenName> screen will be displayed

Examples:
	|screenName|
	|Products|
	|Reciepes|
	|Account|
	|£0.00|

