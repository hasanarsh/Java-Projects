Feature: Find total amount
	To find invoice amount with tax

	Scenario Outline: To find invoice amount with tax
		Given the user provides choice <choice> and the amount <amount> of invoice
		When the user compute invoice with tax
		Then the total amount we found is <total>
	Examples:
	| choice |  amount  |   total   |
	|    1   | 899067.0 | 944020.35 |
	|    2   | 459345.0 | 473125.35 |
	|    2   |  5632.0  |  5800.96  |
	|    1   | 98632.0  | 103563.6  |