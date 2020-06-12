$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Shipment1.feature');
formatter.feature({
  "line": 1,
  "name": "Shipment Page 1",
  "description": "",
  "id": "shipment-page-1",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Page 1 Data",
  "description": "",
  "id": "shipment-page-1;validate-page-1-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Firefox browser is launched and navigated to the shipment page1",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Get the page1 element and click on it",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Validate that table element is present in page1 with expected data and close the driver with quit method",
  "rows": [
    {
      "cells": [
        "Name",
        "Status",
        "Weight",
        "Arrival Port",
        "Depature Port"
      ],
      "line": 7
    },
    {
      "cells": [
        "Computers",
        "Pending",
        "36542.0",
        "Shanghai",
        "Singapore"
      ],
      "line": 8
    },
    {
      "cells": [
        "Laptops",
        "Arrived",
        "13516.0",
        "Shenzhen",
        "HongKong"
      ],
      "line": 9
    },
    {
      "cells": [
        "Furnitures",
        "Delayed",
        "15653.0",
        "Ningbo",
        "Gangzhou"
      ],
      "line": 10
    },
    {
      "cells": [
        "Electronic wastes",
        "Pending",
        "68466.0",
        "Busan",
        "Qingdao"
      ],
      "line": 11
    },
    {
      "cells": [
        "Chairs",
        "Delayed",
        "16843.0",
        "Tainjin",
        "Dubai"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.Firefox_browser_is_launched_and_navigated_to_the_shipment_page()"
});
formatter.result({
  "duration": 16520734954,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.Get_the_page_element_and_click_on_it()"
});
formatter.result({
  "duration": 2479263180,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.Validate_that_table_element_is_present_with_expected_data_and_close_the_driver_with_quit_method(DataTable)"
});
formatter.result({
  "duration": 4310058587,
  "status": "passed"
});
formatter.uri('Shipment2.feature');
formatter.feature({
  "line": 1,
  "name": "Shipment Page 2",
  "description": "",
  "id": "shipment-page-2",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Page 2 Data",
  "description": "",
  "id": "shipment-page-2;validate-page-2-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Firefox browser is launched and navigated to the shipment page2",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Get the page2 element and click on it",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Validate that table element is present in page2 with expected data and close the driver with quit method",
  "rows": [
    {
      "cells": [
        "Name",
        "Status",
        "Weight",
        "Arrival Port",
        "Depature Port"
      ],
      "line": 7
    },
    {
      "cells": [
        "Shoes",
        "Pending",
        "76516.0",
        "Rotterdam",
        "Klang"
      ],
      "line": 8
    },
    {
      "cells": [
        "Clothings",
        "Arrived",
        "16846.0",
        "Kaohsiung",
        "Dalian"
      ],
      "line": 9
    },
    {
      "cells": [
        "Mobile Phomes",
        "Delayed",
        "46863.0",
        "Hemburg",
        "Antwerp"
      ],
      "line": 10
    },
    {
      "cells": [
        "Chemical Wastes",
        "Pending",
        "46846.0",
        "Xiamen",
        "LosAngeles"
      ],
      "line": 11
    },
    {
      "cells": [
        "Television",
        "Delayed",
        "86563.0",
        "LongBeach",
        "TanjungPriok"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.Firefox_browser_is_launched_and_navigated_to_the_shipment_page()"
});
formatter.result({
  "duration": 8728085424,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition2.Get_the_page_element_and_click_on_it()"
});
formatter.result({
  "duration": 2345423475,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition2.Validate_that_table_element_is_present_with_expected_data_and_close_the_driver_with_quit_method(DataTable)"
});
formatter.result({
  "duration": 2242835722,
  "error_message": "org.openqa.selenium.NoSuchWindowException: Window not found. The browser window may have been closed.\nCommand duration or timeout: 205 milliseconds\nBuild info: version: \u00272.47.1\u0027, revision: \u0027411b314\u0027, time: \u00272015-07-30 02:56:46\u0027\nSystem info: host: \u0027DESKTOP-GJ9GTVO\u0027, ip: \u0027192.168.225.69\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d30.0, platform\u003dWINDOWS, browserConnectionEnabled\u003dtrue, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 89865f6d-f159-490c-9a0b-878c0d97987d\n*** Element info: {Using\u003dxpath, value\u003d/html/body/table/tbody/tr[2]/td[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:445)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:358)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\r\n\tat StepDefinition2.Validate_that_table_element_is_present_with_expected_data_and_close_the_driver_with_quit_method(StepDefinition2.java:54)\r\n\tat ✽.Then Validate that table element is present in page2 with expected data and close the driver with quit method(Shipment2.feature:6)\r\nCaused by: org.openqa.selenium.NoSuchWindowException: Window not found. The browser window may have been closed.\nBuild info: version: \u00272.47.1\u0027, revision: \u0027411b314\u0027, time: \u00272015-07-30 02:56:46\u0027\nSystem info: host: \u0027DESKTOP-GJ9GTVO\u0027, ip: \u0027192.168.225.69\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.nsCommandProcessor.prototype.execute(file:///C:/Users/hasan/AppData/Local/Temp/anonymous278896216088576914webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12711)\r\n\tat \u003canonymous class\u003e.Dispatcher.executeAs/\u003c(file:///C:/Users/hasan/AppData/Local/Temp/anonymous278896216088576914webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:9456)\r\n\tat \u003canonymous class\u003e.Resource.prototype.handle(file:///C:/Users/hasan/AppData/Local/Temp/anonymous278896216088576914webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:9603)\r\n\tat \u003canonymous class\u003e.Dispatcher.prototype.dispatch(file: