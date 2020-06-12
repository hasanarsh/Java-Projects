Feature: Shipment Page 5 

Scenario: Validate Page 5 Data 
	Given Firefox browser is launched and navigated to the shipment page5 
	When Get the page5 element and click on it 
	Then Validate that table element is present in page5 with expected data and close the driver with quit method 
		|Name           | Status  | Weight  | Arrival Port | Depature Port | 
		|Table Fan      | Delayed | 68463.0 | Taicang   | Salalah       | 
		|Water Purifier | Arrived | 46843.0 | Vancouver  | Yokohama      | 
		|Air cooler    | Pending | 65498.0 | Nanjing     | Nagoya        | 
		|Medical Waste | Arrived | 98492.0 | Mundra       | Durban     | 
		|Music Player   | Pending | 68463.0 | Kobe       | Osaka    | 