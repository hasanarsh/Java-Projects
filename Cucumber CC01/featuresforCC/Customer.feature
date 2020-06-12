Feature: Customer Registration Test

	Scenario: Customer Registration successful
	Given start browser by creating a driver instance
	When To test the page 
	And with below data:
	|Ramu|65|Ramgad|65656565|ramu@ramgad.com|submit|
	Then To validate expected as below and quit driver:
	|Ramu|65|Ramgad|65656565|ramu@ramgad.com||Registered Succesfully|
	
	
	Scenario: Customer Registration Reset
	When To test the page reset button
	And with below data:
	|Ramu|65|Ramgad|65656565|ramu@ramgad.com|reset|
	Then To validate expected as below and quit driver:
	||||||Customer Form|
	
	Scenario: Customer Registration invalid Name
	When To test the page reset button
	And with below data:
	||65|Ramgad|65656565|ramu@ramgad.com|submit|
	Then To validate expected as below and quit driver:
	|||||Customer name cannot be blank|Customer Form|
	
	
	
