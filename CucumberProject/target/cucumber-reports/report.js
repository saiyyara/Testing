$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "This is Login Functionality",
  "description": "",
  "id": "this-is-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Login Functionality Validation",
  "description": "",
  "id": "this-is-login-functionality;login-functionality-validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@scenariowithDatatable"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I Open OrangeHrms URL on \"\u003cBrowser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \"\u003cUsername\u003e\" in Username Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"\u003cPassword\u003e\" in Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Click Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I close the Browser",
  "keyword": "When "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "this-is-login-functionality;login-functionality-validation;",
  "rows": [
    {
      "cells": [
        "Browser",
        "Username",
        "Password"
      ],
      "line": 20,
      "id": "this-is-login-functionality;login-functionality-validation;;1"
    },
    {
      "cells": [
        "chrome",
        "Admin",
        "Qedge123!@#"
      ],
      "line": 21,
      "id": "this-is-login-functionality;login-functionality-validation;;2"
    },
    {
      "cells": [
        "firefox",
        "Admin",
        "admin123"
      ],
      "line": 22,
      "id": "this-is-login-functionality;login-functionality-validation;;3"
    },
    {
      "cells": [
        "chrome",
        "Admin",
        "Qedge123!@#"
      ],
      "line": 23,
      "id": "this-is-login-functionality;login-functionality-validation;;4"
    },
    {
      "cells": [
        "firefox",
        "Admin",
        "admin"
      ],
      "line": 24,
      "id": "this-is-login-functionality;login-functionality-validation;;5"
    },
    {
      "cells": [
        "chrome",
        "Admin",
        "test123"
      ],
      "line": 25,
      "id": "this-is-login-functionality;login-functionality-validation;;6"
    },
    {
      "cells": [
        "firefox",
        "Admin",
        "Qedge123!@#"
      ],
      "line": 26,
      "id": "this-is-login-functionality;login-functionality-validation;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Login Functionality Validation",
  "description": "",
  "id": "this-is-login-functionality;login-functionality-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@scenariowithDatatable"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I Open OrangeHrms URL on \"chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \"Admin\" in Username Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"Qedge123!@#\" in Password Field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Click Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I close the Browser",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 26
    }
  ],
  "location": "Multidata.i_Open_OrangeHrms_URL_on(String)"
});
formatter.result({
  "duration": 12360891930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Username_Field(String)"
});
formatter.result({
  "duration": 233475992,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Qedge123!@#",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Password_Field(String)"
});
formatter.result({
  "duration": 138824433,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_Click_Login_Button()"
});
formatter.result({
  "duration": 6960498755,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_should_see_Login_Button()"
});
formatter.result({
  "duration": 26184258,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_close_the_Browser()"
});
formatter.result({
  "duration": 681700876,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Login Functionality Validation",
  "description": "",
  "id": "this-is-login-functionality;login-functionality-validation;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@scenariowithDatatable"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I Open OrangeHrms URL on \"firefox\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \"Admin\" in Username Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"admin123\" in Password Field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Click Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I close the Browser",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 26
    }
  ],
  "location": "Multidata.i_Open_OrangeHrms_URL_on(String)"
});
formatter.result({
  "duration": 31150945288,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Username_Field(String)"
});
formatter.result({
  "duration": 1454149557,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Password_Field(String)"
});
formatter.result({
  "duration": 599461275,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_Click_Login_Button()"
});
formatter.result({
  "duration": 5027888418,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_should_see_Login_Button()"
});
formatter.result({
  "duration": 66775270,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_close_the_Browser()"
});
formatter.result({
  "duration": 4511279272,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Login Functionality Validation",
  "description": "",
  "id": "this-is-login-functionality;login-functionality-validation;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@scenariowithDatatable"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I Open OrangeHrms URL on \"chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \"Admin\" in Username Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"Qedge123!@#\" in Password Field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Click Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I close the Browser",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 26
    }
  ],
  "location": "Multidata.i_Open_OrangeHrms_URL_on(String)"
});
formatter.result({
  "duration": 6575714530,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Username_Field(String)"
});
formatter.result({
  "duration": 98638818,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Qedge123!@#",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Password_Field(String)"
});
formatter.result({
  "duration": 102243072,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_Click_Login_Button()"
});
formatter.result({
  "duration": 7292913531,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_should_see_Login_Button()"
});
formatter.result({
  "duration": 21512630,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_close_the_Browser()"
});
formatter.result({
  "duration": 183319198,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Login Functionality Validation",
  "description": "",
  "id": "this-is-login-functionality;login-functionality-validation;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@scenariowithDatatable"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I Open OrangeHrms URL on \"firefox\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \"Admin\" in Username Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"admin\" in Password Field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Click Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I close the Browser",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 26
    }
  ],
  "location": "Multidata.i_Open_OrangeHrms_URL_on(String)"
});
formatter.result({
  "duration": 7560668657,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Username_Field(String)"
});
formatter.result({
  "duration": 57061604,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Password_Field(String)"
});
formatter.result({
  "duration": 29361189,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_Click_Login_Button()"
});
formatter.result({
  "duration": 4271788570,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_should_see_Login_Button()"
});
formatter.result({
  "duration": 68659503,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_close_the_Browser()"
});
formatter.result({
  "duration": 2088528153,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Login Functionality Validation",
  "description": "",
  "id": "this-is-login-functionality;login-functionality-validation;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@scenariowithDatatable"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I Open OrangeHrms URL on \"chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \"Admin\" in Username Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"test123\" in Password Field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Click Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I close the Browser",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 26
    }
  ],
  "location": "Multidata.i_Open_OrangeHrms_URL_on(String)"
});
formatter.result({
  "duration": 6530614701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Username_Field(String)"
});
formatter.result({
  "duration": 97556049,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Password_Field(String)"
});
formatter.result({
  "duration": 86521227,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_Click_Login_Button()"
});
formatter.result({
  "duration": 4182573249,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_should_see_Login_Button()"
});
formatter.result({
  "duration": 91370596,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_close_the_Browser()"
});
formatter.result({
  "duration": 231997156,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Login Functionality Validation",
  "description": "",
  "id": "this-is-login-functionality;login-functionality-validation;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@scenariowithDatatable"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I Open OrangeHrms URL on \"firefox\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter \"Admin\" in Username Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"Qedge123!@#\" in Password Field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Click Login Button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should see Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I close the Browser",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 26
    }
  ],
  "location": "Multidata.i_Open_OrangeHrms_URL_on(String)"
});
formatter.result({
  "duration": 7617462486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Username_Field(String)"
});
formatter.result({
  "duration": 52208037,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Qedge123!@#",
      "offset": 9
    }
  ],
  "location": "Multidata.i_enter_in_Password_Field(String)"
});
formatter.result({
  "duration": 35152908,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_Click_Login_Button()"
});
formatter.result({
  "duration": 5847845052,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_should_see_Login_Button()"
});
formatter.result({
  "duration": 9103004,
  "status": "passed"
});
formatter.match({
  "location": "Multidata.i_close_the_Browser()"
});
formatter.result({
  "duration": 1650703170,
  "status": "passed"
});
});