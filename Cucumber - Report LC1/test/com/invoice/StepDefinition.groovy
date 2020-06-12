package com.invoice;
this.metaClass.mixin(cucumber.runtime.groovy.Hooks)
this.metaClass.mixin(cucumber.runtime.groovy.EN)
Given(~'^the user provides choice (\\d+) and the amount ([0-9]+[.]*[0-9]*) of invoice$') { int arg1, double arg2 ->
	invoiceBO = new InvoiceBO()
	choice = arg1
	amount = arg2
}

When(~'^the user compute invoice with tax$') { ->
	total = invoiceBO.getAmountWithTax(choice, amount)
}

Then(~'^the total amount we found is ([0-9]+[.]*[0-9]*)$') { double arg1 ->
    assert arg1 == total
}