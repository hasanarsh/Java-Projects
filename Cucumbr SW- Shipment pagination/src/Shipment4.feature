Feature: Shipment Page 4 

Scenario: Validate Page 4 Data 
	Given Firefox browser is launched and navigated to the shipment page4 
	When Get the page4 element and click on it 
	Then Validate that table element is present in page4 with expected data and close the driver with quit method 
		|Name          | Status  | Weight  | Arrival Port | Depature Port | 
		|Bio Waste      | Delayed | 68465.0 | Felixstove | PortSaid      | 
		|Irom Box      | Pending | 83546.0 | Sharjah  | Santos        | 
		|Mixer Grinder | Arrived | 35466.0 | Piraeus     | Manila       | 
		|Cock | Arrived | 46862.0 | Ambarli  | Savanah     | 
		|Washing Machine | Pending | 43846.0 | Colon      | Balboa  | 