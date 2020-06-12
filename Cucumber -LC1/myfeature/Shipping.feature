Feature: Cargo Shipping Cost Calculation

	Scenario Outline: Cargo Shipping Cost Calculation 
	Given load the application from the given URL
	When Tests the cost calculation by giving "<input>"
	Then validates "<results>" of the test
	
	Examples:
	|input|results|
	|air|Dear Customer, your total shipping cost is $100|
	|road|Dear Customer, your total shipping cost is $50|
	|ship|Dear Customer, your total shipping cost is $70|

	