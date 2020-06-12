Feature: Shipment Page 1 

Scenario: Validate Page 1 Data 
	Given Firefox browser is launched and navigated to the shipment page1 
	When Get the page1 element and click on it 
	Then Validate that table element is present in page1 with expected data and close the driver with quit method 
		|Name               | Status  | Weight  | Arrival Port | Depature Port | 
		|Computers          | Pending | 36542.0 | Shanghai   | Singapore      | 
		|Laptops            | Arrived | 13516.0 | Shenzhen  | HongKong       | 
		|Furnitures         | Delayed | 15653.0 | Ningbo       | Gangzhou       | 
		|Electronic wastes  | Pending | 68466.0 | Busan        | Qingdao        | 
		|Chairs             | Delayed | 16843.0 | Tainjin      | Dubai          | 
