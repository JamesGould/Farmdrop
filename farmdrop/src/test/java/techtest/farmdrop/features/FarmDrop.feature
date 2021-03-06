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
	|Basket|
	
Scenario: Existing users can log in successfully

Scenario: New users can successfully create an account

Scenario: New users recieve an error - Invalid email address

Scenario: New users recieve an error - Invalid password

Scenario: Items can be added to the basket

Scenario: Value of the basket is updated when an item is added

Scenario: Items can be removed from the basket

Scenario: Value of the basket is updated when an item is removed

Scenario: Tapping on an item displays the details screen

Scenario: Items can be searched for using the search bar

Scenario: Products can be searched for by section

Scenario: Producers can be searched for using the search bar

Scenario: Producers can be search for by location

Scenario: Account - Existing user can log in

Scenario: Account - New users can sign up

Scenario: Account - The Get in Touch screen can be opened