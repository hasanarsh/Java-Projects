package com.invoice;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@Cucumber.Options(format={"json:target/cucumber.json"})
public class InvoiceTest {
}