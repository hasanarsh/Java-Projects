Feature: Shipment Page 2 

Scenario: Validate Page 2 Data 
	Given Firefox browser is launched and navigated to the shipment page2 
	When Get the page2 element and click on it 
	Then Validate that table element is present in page2 with expected data and close the driver with quit method 
		|Name            | Status  | Weight  | Arrival Port | Depature Port | 
		|Shoes           | Pending | 76516.0 | Rotterdam   | Klang        | 
		|Clothings       | Arrived | 16846.0 | Kaohsiung   | Dalian        | 
		|Mobile Phomes   | Delayed | 46863.0 | Hemburg      | Antwerp       | 
		|Chemical Wastes | Pending | 46846.0 | Xiamen       | LosAngeles    | 
		|Television      | Delayed | 86563.0 | LongBeach    | TanjungPriok  | 
