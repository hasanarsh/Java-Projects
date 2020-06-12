Feature: Shipment Page 3 

Scenario: Validate Page 3 Data 
	Given Firefox browser is launched and navigated to the shipment page3 
	When Get the page3 element and click on it 
	Then Validate that table element is present in page3 with expected data and close the driver with quit method 
		|Name            | Status  | Weight  | Arrival Port | Depature Port | 
		|Air Conditionar | Arrived | 76865.0 | Breman   | NewYork      | 
		|Ceiling Fan     | Delayed | 46843.0 | Yingkou  | Lainyungang   | 
		|Refridgerator   | Pending | 35465.0 | Colambo      | Tokyo        | 
		|Water heater | Delayed | 35489.0 | Algeciras    | Mumbai      | 
		|Home Theater    | Arrived | 98463.0 | Valencia     | Jedah    | 
