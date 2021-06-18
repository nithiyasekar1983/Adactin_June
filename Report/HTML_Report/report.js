$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Passowrd Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;adactin;;1"
    },
    {
      "cells": [
        "AAA",
        "123"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;adactin;;2"
    },
    {
      "cells": [
        "BBB",
        "456"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;adactin;;3"
    },
    {
      "cells": [
        "nithiyasekar2010",
        "melijofi"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;adactin;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"AAA\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123\" In Passowrd Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 53387587600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 16322907600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Passowrd_Field(String)"
});
formatter.result({
  "duration": 1531860700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "duration": 10054952600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"BBB\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"456\" In Passowrd Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 2482019100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BBB",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 181546800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "456",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Passowrd_Field(String)"
});
formatter.result({
  "duration": 403297900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "duration": 1053982700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Adactin",
  "description": "",
  "id": "hotel-booking-in-adactin-application;adactin;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"nithiyasekar2010\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"melijofi\" In Passowrd Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 388733700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nithiyasekar2010",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 442631300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "melijofi",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Passowrd_Field(String)"
});
formatter.result({
  "duration": 184063600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "duration": 6990541500,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user Select The Location In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user Select The Hotel Name In The Hotel Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Room Type In The Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The NUmber Of Rooms In The Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Number Of Rooms In The Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Number Of Rooms In The  Per Children Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On The Search button And It Navigates To The Select Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_In_The_Location_Field()"
});
formatter.result({
  "duration": 4684772600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_Name_In_The_Hotel_Name_Field()"
});
formatter.result({
  "duration": 338374800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_In_The_Room_Type_Field()"
});
formatter.result({
  "duration": 376541100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_NUmber_Of_Rooms_In_The_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 308450900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_In_The_Adults_Per_Room_Field()"
});
formatter.result({
  "duration": 280974100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_In_The_Per_Children_Room_Field()"
});
formatter.result({
  "duration": 822099700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Search_button_And_It_Navigates_To_The_Select_Hotel()"
});
formatter.result({
  "duration": 3143276200,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Select The Radio Button In The Select field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Select The Continue Button And It Navigates To The Book A Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Radio_Button_In_The_Select_field()"
});
formatter.result({
  "duration": 124063600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel()"
});
formatter.result({
  "duration": 1902950600,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Enter The First Name In The First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Last Name In The Last Name Fiel",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user enter The Address In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Credit Card Number In The Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select The Credit Card Type In The Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select The Expiry Month In the Select Month Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select The Expiry Year In The Select Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user select the CVV Number In The CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Click The Book Now Button And It Naviagtes To The Booking Conformation",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_First_Name_In_The_First_Name_Field()"
});
formatter.result({
  "duration": 3825856700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_In_The_Last_Name_Fiel()"
});
formatter.result({
  "duration": 206511500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_The_Address_In_The_Billing_Address_Field()"
});
formatter.result({
  "duration": 440956000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number_In_The_Credit_Card_No_Field()"
});
formatter.result({
  "duration": 262785300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 502366700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Expiry_Month_In_the_Select_Month_Field()"
});
formatter.result({
  "duration": 201188400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Expiry_Year_In_The_Select_Year_Field()"
});
formatter.result({
  "duration": 313734500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_select_the_CVV_Number_In_The_CVV_Number_Field()"
});
formatter.result({
  "duration": 148325300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Book_Now_Button_And_It_Naviagtes_To_The_Booking_Conformation()"
});
formatter.result({
  "duration": 492342600,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 45,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "user Click The My Itinerary Button And It Navigates To the Booked Itinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_My_Itinerary_Button_And_It_Navigates_To_the_Booked_Itinerary()"
});
formatter.result({
  "duration": 7692238000,
  "status": "passed"
});
});