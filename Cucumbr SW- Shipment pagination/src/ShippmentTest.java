import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:src","json:src/report.json"}, monochrome = true)
public class ShippmentTest {

}
