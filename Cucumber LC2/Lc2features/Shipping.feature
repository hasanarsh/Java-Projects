Feature: Cucumber Parameterization
	
		Scenario: Verify Shipping details
		Given setUp
		When testShippingDetails "link"
		Then validateResult "user"
		
		 