$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('CollegeFee.feature');
formatter.feature({
  "line": 1,
  "name": "Fee Calculation app",
  "description": "",
  "id": "fee-calculation-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 9,
  "name": "Validate fee calculation",
  "description": "",
  "id": "fee-calculation-app;validate-fee-calculation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "firefox is started and navigated to index page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter student name, student type \"Day Scholar\", Number of Students Per room \"0\" and click the get total fee button.",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I validate College Fee \"120000\", Hostel Fee \"0\", Additional Fee \"0\", Total Fee \"120000\" and close the driver with quit method",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.firefox_is_started_and_navigated_to_index_page()"
});
formatter.result({
  "duration": 18188862769,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Day Scholar",
      "offset": 36
    },
    {
      "val": "0",
      "offset": 79
    }
  ],
  "location": "StepDefinition.I_enter_student_name_student_type_Number_of_Students_Per_room_and_click_the_get_total_fee_button(String,String)"
});
formatter.result({
  "duration": 1873484530,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "120000",
      "offset": 24
    },
    {
      "val": "0",
      "offset": 45
    },
    {
      "val": "0",
      "offset": 65
    },
    {
      "val": "120000",
      "offset": 80
    }
  ],
  "location": "StepDefinition.I_validate_College_Fee_Hostel_Fee_Additional_Fee_Total_Fee_and_close_the_driver_with_quit_method(String,String,String,String)"
});
formatter.result({
  "duration": 1901274891,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validate fee calculation",
  "description": "",
  "id": "fee-calculation-app;validate-fee-calculation;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "firefox is started and navigated to index page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter student name, student type \"Hosteller\", Number of Students Per room \"1\" and click the get total fee button.",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I validate College Fee \"120000\", Hostel Fee \"75750\", Additional Fee \"30300\", Total Fee \"226050\" and close the driver with quit method",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.firefox_is_started_and_navigated_to_index_page()"
});
formatter.result({
  "duration": 5811609362,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hosteller",
      "offset": 36
    },
    {
      "val": "1",
      "offset": 77
    }
  ],
  "location": "StepDefinition.I_enter_student_name_student_type_Number_of_Students_Per_room_and_click_the_get_total_fee_button(String,String)"
});
formatter.result({
  "duration": 1011217289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "120000",
      "offset": 24
    },
    {
      "val": "75750",
      "offset": 45
    },
    {
      "val": "30300",
      "offset": 69
    },
    {
      "val": "226050",
      "offset": 88
    }
  ],
  "location": "StepDefinition.I_validate_College_Fee_Hostel_Fee_Additional_Fee_Total_Fee_and_close_the_driver_with_quit_method(String,String,String,String)"
});
formatter.result({
  "duration": 889755756,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validate fee calculation",
  "description": "",
  "id": "fee-calculation-app;validate-fee-calculation;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "firefox is started and navigated to index page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter student name, student type \"Hosteller\", Number of Students Per room \"2\" and click the get total fee button.",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I validate College Fee \"120000\", Hostel Fee \"75750\", Additional Fee \"15150\", Total Fee \"210900\" and close the driver with quit method",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.firefox_is_started_and_navigated_to_index_page()"
});
formatter.result({
  "duration": 6206318519,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hosteller",
      "offset": 36
    },
    {
      "val": "2",
      "offset": 77
    }
  ],
  "location": "StepDefinition.I_enter_student_name_student_type_Number_of_Students_Per_room_and_click_the_get_total_fee_button(String,String)"
});
formatter.result({
  "duration": 1408103749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "120000",
      "offset": 24
    },
    {
      "val": "75750",
      "offset": 45
    },
    {
      "val": "15150",
      "offset": 69
    },
    {
      "val": "210900",
      "offset": 88
    }
  ],
  "location": "StepDefinition.I_validate_College_Fee_Hostel_Fee_Additional_Fee_Total_Fee_and_close_the_driver_with_quit_method(String,String,String,String)"
});
formatter.result({
  "duration": 875361853,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validate fee calculation",
  "description": "",
  "id": "fee-calculation-app;validate-fee-calculation;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "firefox is started and navigated to index page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter student name, student type \"Hosteller\", Number of Students Per room \"3\" and click the get total fee button.",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I validate College Fee \"120000\", Hostel Fee \"75750\", Additional Fee \"0\", Total Fee \"195750\" and close the driver with quit method",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.firefox_is_started_and_navigated_to_index_page()"
});
formatter.result({
  "duration": 5685183466,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hosteller",
      "offset": 36
    },
    {
      "val": "3",
      "offset": 77
    }
  ],
  "location": "StepDefinition.I_enter_student_name_student_type_Number_of_Students_Per_room_and_click_the_get_total_fee_button(String,String)"
});
formatter.result({
  "duration": 1265445349,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "120000",
      "offset": 24
    },
    {
      "val": "75750",
      "offset": 45
    },
    {
      "val": "0",
      "offset": 69
    },
    {
      "val": "195750",
      "offset": 84
    }
  ],
  "location": "StepDefinition.I_validate_College_Fee_Hostel_Fee_Additional_Fee_Total_Fee_and_close_the_driver_with_quit_method(String,String,String,String)"
});
formatter.result({
  "duration": 859237118,
  "status": "passed"
});
});